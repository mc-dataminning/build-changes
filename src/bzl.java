import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bzl extends bzx<bpo> {
   @Override
   public Set<byr<?>> a() {
      return ImmutableSet.of(byr.x, byr.y);
   }

   @Override
   protected void a(apf $$0, bpo $$1) {
      bqp<?> $$2 = $$1.dP();
      bnv $$3 = $$1.ez();
      if ($$3 != null) {
         $$2.a(byr.x, $$1.ez());
         bow $$4 = $$3.d();
         if ($$4 instanceof bpo) {
            $$2.a(byr.y, (bpo)$$4);
         }
      } else {
         $$2.b(byr.x);
      }

      $$2.c(byr.y).ifPresent($$2x -> {
         if (!$$2x.bA() || $$2x.dM() != $$0) {
            $$2.b(byr.y);
         }
      });
   }
}
