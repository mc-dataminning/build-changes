import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class byr {
   public static <E extends bwr> byj<E> a(int $$0, BiPredicate<E, bvs> $$1) {
      return cbv.a((Function<cbv.b<E>, ? extends App<cbv.c<E>, cby<E>>>)($$2 -> $$2.group($$2.a(cft.t)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bvs $$7 = $$5.dk();
               bvs $$8 = $$2.<bvs>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bvs $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bwr $$0, bvs $$1, int $$2) {
      return $$1.bK() && $$1.a($$0, (double)$$2) && $$1.dV() == $$0.dV();
   }
}
