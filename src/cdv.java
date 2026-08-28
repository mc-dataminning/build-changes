import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class cdv extends cea<btq> {
   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.of(ccu.h, ccu.M, ccu.an);
   }

   @Override
   protected void a(arf $$0, btq $$1) {
      bus<?> $$2 = $$1.dS();
      List<cln> $$3 = Lists.newArrayList();
      ccw $$4 = $$2.c(ccu.h).orElse(ccw.a());
      Optional<bts> $$5 = $$4.a($$0x -> $$0x instanceof ckv || $$0x instanceof ciw).map(bts.class::cast);

      for (btq $$7 : $$2.c(ccu.g).orElse(ImmutableList.of())) {
         if ($$7 instanceof cln && ((cln)$$7).gr()) {
            $$3.add((cln)$$7);
         }
      }

      $$2.a(ccu.M, $$5);
      $$2.a(ccu.an, $$3);
   }
}
