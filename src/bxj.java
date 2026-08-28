import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bxj {
   public static <E extends bvh> bxb<E> a(int $$0, BiPredicate<E, bul> $$1) {
      return can.a((Function<can.b<E>, ? extends App<can.c<E>, caq<E>>>)($$2 -> $$2.group($$2.a(cel.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bul $$7 = $$5.dk();
               bul $$8 = $$2.<bul>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bul $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bvh $$0, bul $$1, int $$2) {
      return $$1.bL() && $$1.a($$0, (double)$$2) && $$1.dV() == $$0.dV();
   }
}
