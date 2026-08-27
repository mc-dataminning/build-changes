import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bvr extends bwc<blv> {
   @Override
   public Set<bux<?>> a() {
      return ImmutableSet.of(bux.x, bux.y);
   }

   @Override
   protected void a(amp $$0, blv $$1) {
      bmv<?> $$2 = $$1.dO();
      bkd $$3 = $$1.ex();
      if ($$3 != null) {
         $$2.a(bux.x, $$1.ex());
         blf $$4 = $$3.d();
         if ($$4 instanceof blv) {
            $$2.a(bux.y, (blv)$$4);
         }
      } else {
         $$2.b(bux.x);
      }

      $$2.c(bux.y).ifPresent($$2x -> {
         if (!$$2x.bx() || $$2x.dM() != $$0) {
            $$2.b(bux.y);
         }
      });
   }
}
