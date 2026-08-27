import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bov {
   private static hx a(bmn $$0, hx $$1) {
      auv $$2 = $$0.dM().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(auv $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bmn> bpn<E> a(bvn<hx> $$0, int $$1, float $$2) {
      return brp.a(
         (Function<brp.b<E>, ? extends App<brp.c<E>, brs<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bvn.o), $$3.c(bvn.m), $$3.a(bvn.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     hx $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dm(), (double)$$1);
                     if (!$$8) {
                        boe.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
