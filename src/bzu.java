import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzu {
   public static <E extends bxu> bzm<E> a(int $$0, BiPredicate<E, bwt> $$1) {
      return ccy.a((Function<ccy.b<E>, ? extends App<ccy.c<E>, cdb<E>>>)($$2 -> $$2.group($$2.a(cgw.t)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bwt $$7 = $$5.dk();
               bwt $$8 = $$2.<bwt>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bwt $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bxu $$0, bwt $$1, int $$2) {
      return $$1.bJ() && $$1.a($$0, (double)$$2) && $$1.dV() == $$0.dV();
   }
}
