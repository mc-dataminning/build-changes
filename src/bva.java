import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bva {
   public static <E extends bsy> bus<E> a(int $$0, BiPredicate<E, bsd> $$1) {
      return bye.a((Function<bye.b<E>, ? extends App<bye.c<E>, byh<E>>>)($$2 -> $$2.group($$2.a(ccc.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bsd $$7 = $$5.dc();
               bsd $$8 = $$2.<bsd>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bsd $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bsy $$0, bsd $$1, int $$2) {
      return $$1.bD() && $$1.a($$0, (double)$$2) && $$1.dP() == $$0.dP();
   }
}
