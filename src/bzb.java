import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzb {
   private static jj a(bwt $$0, jj $$1) {
      azs $$2 = $$0.dV().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azs $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bwt> bzt<E> a(cft<jj> $$0, int $$1, float $$2) {
      return cbv.a(
         (Function<cbv.b<E>, ? extends App<cbv.c<E>, cby<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cft.p), $$3.c(cft.n), $$3.a(cft.o))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     jj $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dv(), (double)$$1);
                     if (!$$8) {
                        byk.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
