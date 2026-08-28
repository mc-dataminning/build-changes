import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzo {
   private static iu a(bxg $$0, iu $$1) {
      azv $$2 = $$0.dV().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azv $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bxg> cag<E> a(cgg<iu> $$0, int $$1, float $$2) {
      return cci.a(
         (Function<cci.b<E>, ? extends App<cci.c<E>, ccl<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cgg.p), $$3.c(cgg.n), $$3.a(cgg.o))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     iu $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dv(), (double)$$1);
                     if (!$$8) {
                        byx.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
