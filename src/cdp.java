import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdp extends cdu<btk> {
   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.of(cco.h, cco.M, cco.an);
   }

   @Override
   protected void a(arb $$0, btk $$1) {
      bum<?> $$2 = $$1.dS();
      List<clh> $$3 = Lists.newArrayList();
      ccq $$4 = $$2.c(cco.h).orElse(ccq.a());
      Optional<btm> $$5 = $$4.a($$0x -> $$0x instanceof ckp || $$0x instanceof ciq).map(btm.class::cast);

      for (btk $$7 : $$2.c(cco.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof clh && ((clh)$$7).gr()) {
            $$3.add((clh)$$7);
         }
      }

      $$2.a(cco.M, $$5);
      $$2.a(cco.an, $$3);
   }
}
