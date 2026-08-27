import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bmy {
   public static <E extends bky> bmq<E> a(int $$0, BiPredicate<E, bki> $$1) {
      return bqb.a((Function<bqb.b<E>, ? extends App<bqb.c<E>, bqe<E>>>)($$2 -> $$2.group($$2.a(btz.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bki $$7 = $$5.cY();
               bki $$8 = $$2.<bki>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bki $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bky $$0, bki $$1, int $$2) {
      return $$1.bv() && $$1.a($$0, (double)$$2) && $$1.dL() == $$0.dL();
   }
}
