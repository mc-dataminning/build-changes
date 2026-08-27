import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bsa {
   private static ib a(bpr $$0, ib $$1) {
      axd $$2 = $$0.dM().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(axd $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bpr> bss<E> a(bys<ib> $$0, int $$1, float $$2) {
      return buu.a(
         (Function<buu.b<E>, ? extends App<buu.c<E>, bux<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bys.o), $$3.c(bys.m), $$3.a(bys.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     ib $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dm(), (double)$$1);
                     if (!$$8) {
                        brj.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
