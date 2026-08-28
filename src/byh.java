import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class byh {
   public static <E extends bwf> bxz<E> a(int $$0, BiPredicate<E, bvj> $$1) {
      return cbl.a((Function<cbl.b<E>, ? extends App<cbl.c<E>, cbo<E>>>)($$2 -> $$2.group($$2.a(cfj.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bvj $$7 = $$5.dk();
               bvj $$8 = $$2.<bvj>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bvj $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.ae();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(bwf $$0, bvj $$1, int $$2) {
      return $$1.bL() && $$1.a($$0, (double)$$2) && $$1.dV() == $$0.dV();
   }
}
