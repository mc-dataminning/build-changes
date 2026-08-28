import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bwo {
   public static <E extends bun> bwg<E> a(int $$0, BiPredicate<E, btr> $$1) {
      return bzs.a((Function<bzs.b<E>, ? extends App<bzs.c<E>, bzv<E>>>)($$2 -> $$2.group($$2.a(cdq.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               btr $$7 = $$5.dg();
               btr $$8 = $$2.<btr>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  btr $$9 = $$7 == null ? $$8 : $$7;
                  if (a($$5, $$9, $$0) && !$$1.test((E)$$5, $$9)) {
                     return false;
                  } else {
                     $$5.af();
                     $$3.b();
                     return true;
                  }
               }
            })));
   }

   private static boolean a(bun $$0, btr $$1, int $$2) {
      return $$1.bI() && $$1.a($$0, (double)$$2) && $$1.dS() == $$0.dS();
   }
}
