import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bvm {
   public static <E extends btk> bve<E> a(int $$0, BiPredicate<E, bsp> $$1) {
      return byq.a((Function<byq.b<E>, ? extends App<byq.c<E>, byt<E>>>)($$2 -> $$2.group($$2.a(cco.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bsp $$7 = $$5.dc();
               bsp $$8 = $$2.<bsp>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bsp $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(btk $$0, bsp $$1, int $$2) {
      return $$1.bD() && $$1.a($$0, (double)$$2) && $$1.dP() == $$0.dP();
   }
}
