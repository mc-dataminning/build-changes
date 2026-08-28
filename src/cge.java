import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cge extends cgq<bwg> {
   @Override
   public Set<cfk<?>> a() {
      return ImmutableSet.of(cfk.x, cfk.y);
   }

   @Override
   protected void a(ash $$0, bwg $$1) {
      bxi<?> $$2 = $$1.ec();
      bua $$3 = $$1.eG();
      if ($$3 != null) {
         $$2.a(cfk.x, $$1.eG());
         bvk $$4 = $$3.d();
         if ($$4 instanceof bwg) {
            $$2.a(cfk.y, (bwg)$$4);
         }
      } else {
         $$2.b(cfk.x);
      }

      $$2.c(cfk.y).ifPresent($$2x -> {
         if (!$$2x.bL() || $$2x.dW() != $$0) {
            $$2.b(cfk.y);
         }
      });
   }
}
