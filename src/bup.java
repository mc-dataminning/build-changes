import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bup {
   public static <E extends bso> buh<E> a(int $$0, BiPredicate<E, brv> $$1) {
      return bxt.a((Function<bxt.b<E>, ? extends App<bxt.c<E>, bxw<E>>>)($$2 -> $$2.group($$2.a(cbr.s)).apply($$2, $$3 -> ($$4, $$5, $$6) -> {
               brv $$7 = $$5.dh();
               brv $$8 = $$2.<brv>a($$3).orElse(null);
               if ($$7 == null && $$8 == null) {
                  return false;
               } else {
                  brv $$9 = $$7 == null ? $$8 : $$7;
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

   private static boolean a(bso $$0, brv $$1, int $$2) {
      return $$1.bI() && $$1.a($$0, (double)$$2) && $$1.dU() == $$0.dU();
   }
}
