import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bub {
   public static <E extends bsa> btt<E> a(int $$0, BiPredicate<E, brh> $$1) {
      return bxf.a((Function<bxf.b<E>, ? extends App<bxf.c<E>, bxi<E>>>)($$2 -> $$2.group($$2.a(cbd.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               brh $$7 = $$5.da();
               brh $$8 = $$2.<brh>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  brh $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bsa $$0, brh $$1, int $$2) {
      return $$1.bB() && $$1.a($$0, (double)$$2) && $$1.dN() == $$0.dN();
   }
}
