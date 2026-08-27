import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bst extends bte<biy> {
   @Override
   public Set<bsa<?>> a() {
      return ImmutableSet.of(bsa.x, bsa.y);
   }

   @Override
   protected void a(akk $$0, biy $$1) {
      bjz<?> $$2 = $$1.dM();
      bhg $$3 = $$1.ev();
      if ($$3 != null) {
         $$2.a(bsa.x, $$1.ev());
         bii $$4 = $$3.d();
         if ($$4 instanceof biy) {
            $$2.a(bsa.y, (biy)$$4);
         }
      } else {
         $$2.b(bsa.x);
      }

      $$2.c(bsa.y).ifPresent($$2x -> {
         if (!$$2x.bv() || $$2x.dK() != $$0) {
            $$2.b(bsa.y);
         }
      });
   }
}
