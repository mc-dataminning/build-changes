import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cco extends cda<bsq> {
   @Override
   public Set<cbu<?>> a() {
      return ImmutableSet.of(cbu.x, cbu.y);
   }

   @Override
   protected void a(aqn $$0, bsq $$1) {
      bts<?> $$2 = $$1.dS();
      bqp $$3 = $$1.eC();
      if ($$3 != null) {
         $$2.a(cbu.x, $$1.eC());
         brw $$4 = $$3.d();
         if ($$4 instanceof bsq) {
            $$2.a(cbu.y, (bsq)$$4);
         }
      } else {
         $$2.b(cbu.x);
      }

      $$2.c(cbu.y).ifPresent($$2x -> {
         if (!$$2x.bD() || $$2x.dP() != $$0) {
            $$2.b(cbu.y);
         }
      });
   }
}
