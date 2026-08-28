import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ccz extends cdl<btb> {
   @Override
   public Set<ccf<?>> a() {
      return ImmutableSet.of(ccf.x, ccf.y);
   }

   @Override
   protected void a(aqm $$0, btb $$1) {
      bud<?> $$2 = $$1.dU();
      bqz $$3 = $$1.ez();
      if ($$3 != null) {
         $$2.a(ccf.x, $$1.ez());
         bsg $$4 = $$3.d();
         if ($$4 instanceof btb) {
            $$2.a(ccf.y, (btb)$$4);
         }
      } else {
         $$2.b(ccf.x);
      }

      $$2.c(ccf.y).ifPresent($$2x -> {
         if (!$$2x.bE() || $$2x.dQ() != $$0) {
            $$2.b(ccf.y);
         }
      });
   }
}
