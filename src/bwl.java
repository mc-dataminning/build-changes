import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bwl {
   public static <E extends buk> bwd<E> a(int $$0, BiPredicate<E, bto> $$1) {
      return bzp.a((Function<bzp.b<E>, ? extends App<bzp.c<E>, bzs<E>>>)($$2 -> $$2.group($$2.a(cdn.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bto $$7 = $$5.dg();
               bto $$8 = $$2.<bto>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bto $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(buk $$0, bto $$1, int $$2) {
      return $$1.bI() && $$1.a($$0, (double)$$2) && $$1.dS() == $$0.dS();
   }
}
