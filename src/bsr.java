import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bsr extends btc<biw> {
   @Override
   public Set<bry<?>> a() {
      return ImmutableSet.of(bry.x, bry.y);
   }

   @Override
   protected void a(aki $$0, biw $$1) {
      bjx<?> $$2 = $$1.dM();
      bhe $$3 = $$1.ev();
      if ($$3 != null) {
         $$2.a(bry.x, $$1.ev());
         big $$4 = $$3.d();
         if ($$4 instanceof biw) {
            $$2.a(bry.y, (biw)$$4);
         }
      } else {
         $$2.b(bry.x);
      }

      $$2.c(bry.y).ifPresent($$2x -> {
         if (!$$2x.bv() || $$2x.dK() != $$0) {
            $$2.b(bry.y);
         }
      });
   }
}
