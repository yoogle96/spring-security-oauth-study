package com.yoogel.study.oauth.repository;

import com.yoogel.study.oauth.entity.Member;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MemberRepository extends PagingAndSortingRepository<Member, Long> {
}
