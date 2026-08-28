import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cdo extends cea<btq> {
   @Override
   public Set<ccu<?>> a() {
      return ImmutableSet.of(ccu.x, ccu.y);
   }

   @Override
   protected void a(arf $$0, btq $$1) {
      bus<?> $$2 = $$1.dS();
      bro $$3 = $$1.eC();
      if ($$3 != null) {
         $$2.a(ccu.x, $$1.eC());
         bsv $$4 = $$3.d();
         if ($$4 instanceof btq) {
            $$2.a(ccu.y, (btq)$$4);
         }
      } else {
         $$2.b(ccu.x);
      }

      $$2.c(ccu.y).ifPresent($$2x -> {
         if (!$$2x.bD() || $$2x.dP() != $$0) {
            $$2.b(ccu.y);
         }
      });
   }
}
