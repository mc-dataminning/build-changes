import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwd {
   private static iz a(btt $$0, iz $$1) {
      azh $$2 = $$0.dP().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azh $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends btt> bwv<E> a(ccv<iz> $$0, int $$1, float $$2) {
      return byx.a(
         (Function<byx.b<E>, ? extends App<byx.c<E>, bza<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(ccv.o), $$3.c(ccv.m), $$3.a(ccv.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     iz $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dp(), (double)$$1);
                     if (!$$8) {
                        bvm.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
