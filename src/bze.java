import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bze {
   public static <E extends bxe> byw<E> a(int $$0, BiPredicate<E, bwf> $$1) {
      return cci.a((Function<cci.b<E>, ? extends App<cci.c<E>, ccl<E>>>)($$2 -> $$2.group($$2.a(cgg.t)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bwf $$7 = $$5.dk();
               bwf $$8 = $$2.<bwf>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bwf $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.bP();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(bxe $$0, bwf $$1, int $$2) {
      return $$1.bK() && $$1.a($$0, (double)$$2) && $$1.dV() == $$0.dV();
   }
}
