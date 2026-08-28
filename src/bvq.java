import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bvq {
   public static <E extends bto> bvi<E> a(int $$0, BiPredicate<E, bst> $$1) {
      return byu.a((Function<byu.b<E>, ? extends App<byu.c<E>, byx<E>>>)($$2 -> $$2.group($$2.a(ccs.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bst $$7 = $$5.dc();
               bst $$8 = $$2.<bst>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bst $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bto $$0, bst $$1, int $$2) {
      return $$1.bD() && $$1.a($$0, (double)$$2) && $$1.dP() == $$0.dP();
   }
}
