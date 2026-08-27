import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bnl {
   public static <E extends bll> bnd<E> a(int $$0, BiPredicate<E, bkv> $$1) {
      return bqo.a((Function<bqo.b<E>, ? extends App<bqo.c<E>, bqr<E>>>)($$2 -> $$2.group($$2.a(bum.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bkv $$7 = $$5.da();
               bkv $$8 = $$2.<bkv>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bkv $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bll $$0, bkv $$1, int $$2) {
      return $$1.bx() && $$1.a($$0, (double)$$2) && $$1.dN() == $$0.dN();
   }
}
