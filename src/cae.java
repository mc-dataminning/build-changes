import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cae {
   private static iv a(bxw $$0, iv $$1) {
      azx $$2 = $$0.dV().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azx $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bxw> caw<E> a(cgw<iv> $$0, int $$1, float $$2) {
      return ccy.a(
         (Function<ccy.b<E>, ? extends App<ccy.c<E>, cdb<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cgw.p), $$3.c(cgw.n), $$3.a(cgw.o))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     iv $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dv(), (double)$$1);
                     if (!$$8) {
                        bzn.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
