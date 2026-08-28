import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bvp {
   public static <E extends btn> bvh<E> a(int $$0, BiPredicate<E, bss> $$1) {
      return byt.a((Function<byt.b<E>, ? extends App<byt.c<E>, byw<E>>>)($$2 -> $$2.group($$2.a(ccr.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bss $$7 = $$5.dc();
               bss $$8 = $$2.<bss>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bss $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(btn $$0, bss $$1, int $$2) {
      return $$1.bD() && $$1.a($$0, (double)$$2) && $$1.dP() == $$0.dP();
   }
}
