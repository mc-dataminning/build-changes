import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class cfg extends cfs<bvi> {
   @Override
   public Set<cem<?>> a() {
      return ImmutableSet.of(cem.x, cem.y);
   }

   @Override
   protected void a(ard $$0, bvi $$1) {
      bwk<?> $$2 = $$1.eb();
      btc $$3 = $$1.eF();
      if ($$3 != null) {
         $$2.a(cem.x, $$1.eF());
         bum $$4 = $$3.d();
         if ($$4 instanceof bvi) {
            $$2.a(cem.y, (bvi)$$4);
         }
      } else {
         $$2.b(cem.x);
      }

      $$2.c(cem.y).ifPresent($$2x -> {
         if (!$$2x.bL() || $$2x.dV() != $$0) {
            $$2.b(cem.y);
         }
      });
   }
}
