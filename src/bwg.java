import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bwg {
   public static <E extends buf> bvy<E> a(int $$0, BiPredicate<E, btj> $$1) {
      return bzk.a((Function<bzk.b<E>, ? extends App<bzk.c<E>, bzn<E>>>)($$2 -> $$2.group($$2.a(cdi.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               btj $$7 = $$5.dg();
               btj $$8 = $$2.<btj>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  btj $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(buf $$0, btj $$1, int $$2) {
      return $$1.bI() && $$1.a($$0, (double)$$2) && $$1.dS() == $$0.dS();
   }
}
