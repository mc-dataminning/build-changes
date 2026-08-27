import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bsp {
   public static <E extends bqo> bsh<E> a(int $$0, BiPredicate<E, bpv> $$1) {
      return bvt.a((Function<bvt.b<E>, ? extends App<bvt.c<E>, bvw<E>>>)($$2 -> $$2.group($$2.a(bzr.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bpv $$7 = $$5.cZ();
               bpv $$8 = $$2.<bpv>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bpv $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bqo $$0, bpv $$1, int $$2) {
      return $$1.bA() && $$1.a($$0, (double)$$2) && $$1.dM() == $$0.dM();
   }
}
