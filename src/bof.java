import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bof {
   private static hv a(blx $$0, hv $$1) {
      auf $$2 = $$0.dM().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(auf $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends blx> box<E> a(bux<hv> $$0, int $$1, float $$2) {
      return bqz.a(
         (Function<bqz.b<E>, ? extends App<bqz.c<E>, brc<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bux.o), $$3.c(bux.m), $$3.a(bux.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     hv $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dm(), (double)$$1);
                     if (!$$8) {
                        bno.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
