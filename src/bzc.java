import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bzc {
   public static <E extends bxc> byu<E> a(int $$0, BiPredicate<E, bwd> $$1) {
      return ccg.a((Function<ccg.b<E>, ? extends App<ccg.c<E>, ccj<E>>>)($$2 -> $$2.group($$2.a(cge.t)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bwd $$7 = $$5.dk();
               bwd $$8 = $$2.<bwd>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bwd $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bxc $$0, bwd $$1, int $$2) {
      return $$1.bK() && $$1.a($$0, (double)$$2) && $$1.dV() == $$0.dV();
   }
}
