import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class bss extends btd<biy> {
   @Override
   public Set<brz<?>> a() {
      return ImmutableSet.of(brz.x, brz.y);
   }

   @Override
   protected void a(akk $$0, biy $$1) {
      bjy<?> $$2 = $$1.dM();
      bhg $$3 = $$1.ev();
      if ($$3 != null) {
         $$2.a(brz.x, $$1.ev());
         bii $$4 = $$3.d();
         if ($$4 instanceof biy) {
            $$2.a(brz.y, (biy)$$4);
         }
      } else {
         $$2.b(brz.x);
      }

      $$2.c(brz.y).ifPresent($$2x -> {
         if (!$$2x.bv() || $$2x.dK() != $$0) {
            $$2.b(brz.y);
         }
      });
   }
}
