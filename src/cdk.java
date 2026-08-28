import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cdk extends cdw<btl> {
   @Override
   public Set<ccq<?>> a() {
      return ImmutableSet.of(ccq.x, ccq.y);
   }

   @Override
   protected void a(aqt $$0, btl $$1) {
      buo<?> $$2 = $$1.dU();
      brj $$3 = $$1.ez();
      if ($$3 != null) {
         $$2.a(ccq.x, $$1.ez());
         bsq $$4 = $$3.d();
         if ($$4 instanceof btl) {
            $$2.a(ccq.y, (btl)$$4);
         }
      } else {
         $$2.b(ccq.x);
      }

      $$2.c(ccq.y).ifPresent($$2x -> {
         if (!$$2x.bE() || $$2x.dQ() != $$0) {
            $$2.b(ccq.y);
         }
      });
   }
}
