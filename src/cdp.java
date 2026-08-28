import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cdp extends ceb<btr> {
   @Override
   public Set<ccv<?>> a() {
      return ImmutableSet.of(ccv.x, ccv.y);
   }

   @Override
   protected void a(arf $$0, btr $$1) {
      but<?> $$2 = $$1.dS();
      brp $$3 = $$1.eC();
      if ($$3 != null) {
         $$2.a(ccv.x, $$1.eC());
         bsw $$4 = $$3.d();
         if ($$4 instanceof btr) {
            $$2.a(ccv.y, (btr)$$4);
         }
      } else {
         $$2.b(ccv.x);
      }

      $$2.c(ccv.y).ifPresent($$2x -> {
         if (!$$2x.bD() || $$2x.dP() != $$0) {
            $$2.b(ccv.y);
         }
      });
   }
}
