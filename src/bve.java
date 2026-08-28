import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bve {
   public static <E extends btc> buw<E> a(int $$0, BiPredicate<E, bsh> $$1) {
      return byi.a((Function<byi.b<E>, ? extends App<byi.c<E>, byl<E>>>)($$2 -> $$2.group($$2.a(ccg.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bsh $$7 = $$5.de();
               bsh $$8 = $$2.<bsh>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bsh $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.ad();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(btc $$0, bsh $$1, int $$2) {
      return $$1.bF() && $$1.a($$0, (double)$$2) && $$1.dR() == $$0.dR();
   }
}
