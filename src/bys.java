import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bys {
   private static jh a(bwi $$0, jh $$1) {
      bam $$2 = $$0.dW().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(bam $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bwi> bzk<E> a(cfk<jh> $$0, int $$1, float $$2) {
      return cbm.a(
         (Function<cbm.b<E>, ? extends App<cbm.c<E>, cbp<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cfk.o), $$3.c(cfk.m), $$3.a(cfk.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     jh $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dw(), (double)$$1);
                     if (!$$8) {
                        byb.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
