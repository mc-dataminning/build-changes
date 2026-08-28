import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bvd {
   public static <E extends btb> buv<E> a(int $$0, BiPredicate<E, bsg> $$1) {
      return byh.a((Function<byh.b<E>, ? extends App<byh.c<E>, byk<E>>>)($$2 -> $$2.group($$2.a(ccf.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bsg $$7 = $$5.dd();
               bsg $$8 = $$2.<bsg>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bsg $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.ac();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(btb $$0, bsg $$1, int $$2) {
      return $$1.bE() && $$1.a($$0, (double)$$2) && $$1.dQ() == $$0.dQ();
   }
}
