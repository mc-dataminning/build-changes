import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cdi extends cdu<btk> {
   @Override
   public Set<cco<?>> a() {
      return ImmutableSet.of(cco.x, cco.y);
   }

   @Override
   protected void a(arb $$0, btk $$1) {
      bum<?> $$2 = $$1.dS();
      bri $$3 = $$1.eC();
      if ($$3 != null) {
         $$2.a(cco.x, $$1.eC());
         bsp $$4 = $$3.d();
         if ($$4 instanceof btk) {
            $$2.a(cco.y, (btk)$$4);
         }
      } else {
         $$2.b(cco.x);
      }

      $$2.c(cco.y).ifPresent($$2x -> {
         if (!$$2x.bD() || $$2x.dP() != $$0) {
            $$2.b(cco.y);
         }
      });
   }
}
