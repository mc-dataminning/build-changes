import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bli {
   public static <E extends bji> bla<E> a(int $$0, BiPredicate<E, bis> $$1) {
      return bol.a((Function<bol.b<E>, ? extends App<bol.c<E>, boo<E>>>)($$2 -> $$2.group($$2.a(bsj.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bis $$7 = $$5.cY();
               bis $$8 = $$2.<bis>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bis $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bji $$0, bis $$1, int $$2) {
      return $$1.bv() && $$1.a($$0, (double)$$2) && $$1.dL() == $$0.dL();
   }
}
