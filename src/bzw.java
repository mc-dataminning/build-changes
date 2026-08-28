import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzw {
   public static <E extends bxw> bzo<E> a(int $$0, BiPredicate<E, bwv> $$1) {
      return cda.a((Function<cda.b<E>, ? extends App<cda.c<E>, cdd<E>>>)($$2 -> $$2.group($$2.a(cgy.t)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bwv $$7 = $$5.dk();
               bwv $$8 = $$2.<bwv>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bwv $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.bO();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(bxw $$0, bwv $$1, int $$2) {
      return $$1.bJ() && $$1.a($$0, (double)$$2) && $$1.dV() == $$0.dV();
   }
}
