import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bya {
   public static <E extends bvy> bxs<E> a(int $$0, BiPredicate<E, bva> $$1) {
      return cbe.a((Function<cbe.b<E>, ? extends App<cbe.c<E>, cbh<E>>>)($$2 -> $$2.group($$2.a(cfc.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bva $$7 = $$5.dj();
               bva $$8 = $$2.<bva>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bva $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.bO();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(bvy $$0, bva $$1, int $$2) {
      return $$1.bJ() && $$1.a($$0, (double)$$2) && $$1.dU() == $$0.dU();
   }
}
