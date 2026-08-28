import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bvt {
   public static <E extends btr> bvl<E> a(int $$0, BiPredicate<E, bsw> $$1) {
      return byx.a((Function<byx.b<E>, ? extends App<byx.c<E>, bza<E>>>)($$2 -> $$2.group($$2.a(ccv.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bsw $$7 = $$5.dc();
               bsw $$8 = $$2.<bsw>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bsw $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(btr $$0, bsw $$1, int $$2) {
      return $$1.bD() && $$1.a($$0, (double)$$2) && $$1.dP() == $$0.dP();
   }
}
