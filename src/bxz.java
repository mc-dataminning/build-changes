import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxz {
   public static <E extends bvx> bxr<E> a(int $$0, BiPredicate<E, bvb> $$1) {
      return cbd.a((Function<cbd.b<E>, ? extends App<cbd.c<E>, cbg<E>>>)($$2 -> $$2.group($$2.a(cfb.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bvb $$7 = $$5.dl();
               bvb $$8 = $$2.<bvb>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bvb $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bvx $$0, bvb $$1, int $$2) {
      return $$1.bL() && $$1.a($$0, (double)$$2) && $$1.dW() == $$0.dW();
   }
}
