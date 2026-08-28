import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdu extends cdz<btp> {
   @Override
   public Set<cct<?>> a() {
      return ImmutableSet.of(cct.h, cct.M, cct.an);
   }

   @Override
   protected void a(arf $$0, btp $$1) {
      bur<?> $$2 = $$1.dS();
      List<clm> $$3 = Lists.newArrayList();
      ccv $$4 = $$2.c(cct.h).orElse(ccv.a());
      Optional<btr> $$5 = $$4.a($$0x -> $$0x instanceof cku || $$0x instanceof civ).map(btr.class::cast);

      for (btp $$7 : $$2.c(cct.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof clm && ((clm)$$7).gr()) {
            $$3.add((clm)$$7);
         }
      }

      $$2.a(cct.M, $$5);
      $$2.a(cct.an, $$3);
   }
}
