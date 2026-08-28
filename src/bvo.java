import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bvo {
   public static <E extends btl> bvg<E> a(int $$0, BiPredicate<E, bsq> $$1) {
      return bys.a((Function<bys.b<E>, ? extends App<bys.c<E>, byv<E>>>)($$2 -> $$2.group($$2.a(ccq.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bsq $$7 = $$5.dd();
               bsq $$8 = $$2.<bsq>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bsq $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(btl $$0, bsq $$1, int $$2) {
      return $$1.bE() && $$1.a($$0, (double)$$2) && $$1.dQ() == $$0.dQ();
   }
}
