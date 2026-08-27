import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bng {
   public static <E extends blg> bmy<E> a(int $$0, BiPredicate<E, bkq> $$1) {
      return bqj.a((Function<bqj.b<E>, ? extends App<bqj.c<E>, bqm<E>>>)($$2 -> $$2.group($$2.a(buh.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bkq $$7 = $$5.da();
               bkq $$8 = $$2.<bkq>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bkq $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(blg $$0, bkq $$1, int $$2) {
      return $$1.bx() && $$1.a($$0, (double)$$2) && $$1.dN() == $$0.dN();
   }
}
