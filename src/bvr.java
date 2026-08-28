import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bvr {
   public static <E extends btp> bvj<E> a(int $$0, BiPredicate<E, bsu> $$1) {
      return byv.a((Function<byv.b<E>, ? extends App<byv.c<E>, byy<E>>>)($$2 -> $$2.group($$2.a(cct.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bsu $$7 = $$5.dc();
               bsu $$8 = $$2.<bsu>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bsu $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(btp $$0, bsu $$1, int $$2) {
      return $$1.bD() && $$1.a($$0, (double)$$2) && $$1.dP() == $$0.dP();
   }
}
