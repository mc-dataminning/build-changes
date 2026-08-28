import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bvs {
   public static <E extends btq> bvk<E> a(int $$0, BiPredicate<E, bsv> $$1) {
      return byw.a((Function<byw.b<E>, ? extends App<byw.c<E>, byz<E>>>)($$2 -> $$2.group($$2.a(ccu.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bsv $$7 = $$5.dc();
               bsv $$8 = $$2.<bsv>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bsv $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(btq $$0, bsv $$1, int $$2) {
      return $$1.bD() && $$1.a($$0, (double)$$2) && $$1.dP() == $$0.dP();
   }
}
