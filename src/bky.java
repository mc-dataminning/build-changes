import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bky {
   public static <E extends biy> bkq<E> a(int $$0, BiPredicate<E, bii> $$1) {
      return bob.a((Function<bob.b<E>, ? extends App<bob.c<E>, boe<E>>>)($$2 -> $$2.group($$2.a(brz.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bii $$7 = $$5.cY();
               bii $$8 = $$2.<bii>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bii $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.aa();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(biy $$0, bii $$1, int $$2) {
      return $$1.bv() && $$1.a($$0, (double)$$2) && $$1.dK() == $$0.dK();
   }
}
