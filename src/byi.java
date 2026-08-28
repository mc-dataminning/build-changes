import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class byi {
   public static <E extends bwg> bya<E> a(int $$0, BiPredicate<E, bvk> $$1) {
      return cbm.a((Function<cbm.b<E>, ? extends App<cbm.c<E>, cbp<E>>>)($$2 -> $$2.group($$2.a(cfk.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bvk $$7 = $$5.dl();
               bvk $$8 = $$2.<bvk>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bvk $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.ae();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(bwg $$0, bvk $$1, int $$2) {
      return $$1.bL() && $$1.a($$0, (double)$$2) && $$1.dW() == $$0.dW();
   }
}
