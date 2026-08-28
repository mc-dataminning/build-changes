import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxh {
   public static <E extends bvf> bwz<E> a(int $$0, BiPredicate<E, buj> $$1) {
      return cal.a((Function<cal.b<E>, ? extends App<cal.c<E>, cao<E>>>)($$2 -> $$2.group($$2.a(cej.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               buj $$7 = $$5.dl();
               buj $$8 = $$2.<buj>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  buj $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bvf $$0, buj $$1, int $$2) {
      return $$1.bL() && $$1.a($$0, (double)$$2) && $$1.dW() == $$0.dW();
   }
}
