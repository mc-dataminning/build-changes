import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class buz {
   private static ir a(bsq $$0, ir $$1) {
      ayt $$2 = $$0.dU().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(ayt $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bsq> bvr<E> a(cbr<ir> $$0, int $$1, float $$2) {
      return bxt.a(
         (Function<bxt.b<E>, ? extends App<bxt.c<E>, bxw<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cbr.o), $$3.c(cbr.m), $$3.a(cbr.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     ir $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.du(), (double)$$1);
                     if (!$$8) {
                        bui.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
