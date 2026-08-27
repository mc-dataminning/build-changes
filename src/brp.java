import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class brp {
   public static <E extends bpo> brh<E> a(int $$0, BiPredicate<E, bow> $$1) {
      return but.a((Function<but.b<E>, ? extends App<but.c<E>, buw<E>>>)($$2 -> $$2.group($$2.a(byr.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bow $$7 = $$5.cZ();
               bow $$8 = $$2.<bow>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bow $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bpo $$0, bow $$1, int $$2) {
      return $$1.bA() && $$1.a($$0, (double)$$2) && $$1.dM() == $$0.dM();
   }
}
