import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzj {
   public static <E extends bxj> bzb<E> a(int $$0, BiPredicate<E, bwi> $$1) {
      return ccn.a((Function<ccn.b<E>, ? extends App<ccn.c<E>, ccq<E>>>)($$2 -> $$2.group($$2.a(cgl.t)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bwi $$7 = $$5.dj();
               bwi $$8 = $$2.<bwi>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bwi $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.bN();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(bxj $$0, bwi $$1, int $$2) {
      return $$1.bI() && $$1.a($$0, (double)$$2) && $$1.dU() == $$0.dU();
   }
}
