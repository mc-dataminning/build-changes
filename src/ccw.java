import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class ccw extends cdi<bsy> {
   @Override
   public Set<ccc<?>> a() {
      return ImmutableSet.of(ccc.x, ccc.y);
   }

   @Override
   protected void a(aqk $$0, bsy $$1) {
      bua<?> $$2 = $$1.dT();
      bqw $$3 = $$1.ey();
      if ($$3 != null) {
         $$2.a(ccc.x, $$1.ey());
         bsd $$4 = $$3.d();
         if ($$4 instanceof bsy) {
            $$2.a(ccc.y, (bsy)$$4);
         }
      } else {
         $$2.b(ccc.x);
      }

      $$2.c(ccc.y).ifPresent($$2x -> {
         if (!$$2x.bD() || $$2x.dP() != $$0) {
            $$2.b(ccc.y);
         }
      });
   }
}
