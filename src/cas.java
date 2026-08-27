import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cas extends cax<bqo> {
   @Override
   public Set<bzr<?>> a() {
      return ImmutableSet.of(bzr.h, bzr.M, bzr.an);
   }

   @Override
   protected void a(aps $$0, bqo $$1) {
      brp<?> $$2 = $$1.dP();
      List<cii> $$3 = Lists.newArrayList();
      bzt $$4 = $$2.c(bzr.h).orElse(bzt.a());
      Optional<bqq> $$5 = $$4.a($$0x -> $$0x instanceof chq || $$0x instanceof cfr).map(bqq.class::cast);

      for (bqo $$7 : $$2.c(bzr.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cii && ((cii)$$7).go()) {
            $$3.add((cii)$$7);
         }
      }

      $$2.a(bzr.M, $$5);
      $$2.a(bzr.an, $$3);
   }
}
