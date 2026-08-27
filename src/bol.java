import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bol {
   public static <E extends bml> bod<E> a(int $$0, BiPredicate<E, blv> $$1) {
      return brp.a((Function<brp.b<E>, ? extends App<brp.c<E>, brs<E>>>)($$2 -> $$2.group($$2.a(bvn.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               blv $$7 = $$5.cZ();
               blv $$8 = $$2.<blv>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  blv $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bml $$0, blv $$1, int $$2) {
      return $$1.bx() && $$1.a($$0, (double)$$2) && $$1.dM() == $$0.dM();
   }
}
