import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnv {
   private static hx a(bln $$0, hx $$1) {
      atw $$2 = $$0.dN().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(atw $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bln> bom<E> a(bum<hx> $$0, int $$1, float $$2) {
      return bqo.a(
         (Function<bqo.b<E>, ? extends App<bqo.c<E>, bqr<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bum.o), $$3.c(bum.m), $$3.a(bum.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     hx $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dn(), (double)$$1);
                     if (!$$8) {
                        bne.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
