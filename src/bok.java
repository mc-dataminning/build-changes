import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bok {
   public static <E extends bmk> boc<E> a(int $$0, BiPredicate<E, blu> $$1) {
      return bro.a((Function<bro.b<E>, ? extends App<bro.c<E>, brr<E>>>)($$2 -> $$2.group($$2.a(bvm.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               blu $$7 = $$5.cZ();
               blu $$8 = $$2.<blu>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  blu $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bmk $$0, blu $$1, int $$2) {
      return $$1.bx() && $$1.a($$0, (double)$$2) && $$1.dM() == $$0.dM();
   }
}
