package roomescape.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import roomescape.dto.MemberPreviewResponse;
import roomescape.service.MemberService;

@RequestMapping("/admin/members")
@RestController
public class AdminMemberController {

    private final MemberService memberService;

    public AdminMemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public ResponseEntity<List<MemberPreviewResponse>> getMembers() {
        List<MemberPreviewResponse> response = memberService.findAllMembers();
        return ResponseEntity.ok(response);
    }
}
