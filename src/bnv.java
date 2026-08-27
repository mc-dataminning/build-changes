import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bnv {
   public static <E extends blv> bnn<E> a(int $$0, BiPredicate<E, blf> $$1) {
      return bqz.a((Function<bqz.b<E>, ? extends App<bqz.c<E>, brc<E>>>)($$2 -> $$2.group($$2.a(bux.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               blf $$7 = $$5.cZ();
               blf $$8 = $$2.<blf>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  blf $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(blv $$0, blf $$1, int $$2) {
      return $$1.bx() && $$1.a($$0, (double)$$2) && $$1.dM() == $$0.dM();
   }
}
