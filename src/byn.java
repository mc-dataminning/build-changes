import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byn {
   private static jh a(bwd $$0, jh $$1) {
      bam $$2 = $$0.dV().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(bam $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bwd> bzf<E> a(cff<jh> $$0, int $$1, float $$2) {
      return cbh.a(
         (Function<cbh.b<E>, ? extends App<cbh.c<E>, cbk<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cff.o), $$3.c(cff.m), $$3.a(cff.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     jh $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dv(), (double)$$1);
                     if (!$$8) {
                        bxw.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
