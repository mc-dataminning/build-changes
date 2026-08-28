import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cda extends cdm<btc> {
   @Override
   public Set<ccg<?>> a() {
      return ImmutableSet.of(ccg.x, ccg.y);
   }

   @Override
   protected void a(aqm $$0, btc $$1) {
      bue<?> $$2 = $$1.dV();
      bra $$3 = $$1.eA();
      if ($$3 != null) {
         $$2.a(ccg.x, $$1.eA());
         bsh $$4 = $$3.d();
         if ($$4 instanceof btc) {
            $$2.a(ccg.y, (btc)$$4);
         }
      } else {
         $$2.b(ccg.x);
      }

      $$2.c(ccg.y).ifPresent($$2x -> {
         if (!$$2x.bF() || $$2x.dR() != $$0) {
            $$2.b(ccg.y);
         }
      });
   }
}
