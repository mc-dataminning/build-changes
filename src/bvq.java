import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bvq {
   public static <E extends btn> bvi<E> a(int $$0, BiPredicate<E, bsr> $$1) {
      return byu.a((Function<byu.b<E>, ? extends App<byu.c<E>, byx<E>>>)($$2 -> $$2.group($$2.a(ccs.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bsr $$7 = $$5.dc();
               bsr $$8 = $$2.<bsr>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bsr $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(btn $$0, bsr $$1, int $$2) {
      return $$1.bE() && $$1.a($$0, (double)$$2) && $$1.dO() == $$0.dO();
   }
}
