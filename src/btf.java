import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class btf {
   public static <E extends bre> bsx<E> a(int $$0, BiPredicate<E, bql> $$1) {
      return bwj.a((Function<bwj.b<E>, ? extends App<bwj.c<E>, bwm<E>>>)($$2 -> $$2.group($$2.a(cah.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               bql $$7 = $$5.da();
               bql $$8 = $$2.<bql>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  bql $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bre $$0, bql $$1, int $$2) {
      return $$1.bB() && $$1.a($$0, (double)$$2) && $$1.dN() == $$0.dN();
   }
}
