import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class brq {
   public static <E extends bpp> bri<E> a(int $$0, BiPredicate<E, box> $$1) {
      return buu.a((Function<buu.b<E>, ? extends App<buu.c<E>, bux<E>>>)($$2 -> $$2.group($$2.a(bys.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               box $$7 = $$5.cZ();
               box $$8 = $$2.<box>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  box $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bpp $$0, box $$1, int $$2) {
      return $$1.bA() && $$1.a($$0, (double)$$2) && $$1.dM() == $$0.dM();
   }
}
