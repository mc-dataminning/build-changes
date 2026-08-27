import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ccm extends ccy<bso> {
   @Override
   public Set<cbs<?>> a() {
      return ImmutableSet.of(cbs.x, cbs.y);
   }

   @Override
   protected void a(aqm $$0, bso $$1) {
      btq<?> $$2 = $$1.dS();
      bqn $$3 = $$1.eC();
      if ($$3 != null) {
         $$2.a(cbs.x, $$1.eC());
         bru $$4 = $$3.d();
         if ($$4 instanceof bso) {
            $$2.a(cbs.y, (bso)$$4);
         }
      } else {
         $$2.b(cbs.x);
      }

      $$2.c(cbs.y).ifPresent($$2x -> {
         if (!$$2x.bD() || $$2x.dP() != $$0) {
            $$2.b(cbs.y);
         }
      });
   }
}
