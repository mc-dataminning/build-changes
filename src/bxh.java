import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxh {
   private static jg a(bux $$0, jg $$1) {
      azr $$2 = $$0.dX().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azr $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bux> bxz<E> a(cdz<jg> $$0, int $$1, float $$2) {
      return cab.a(
         (Function<cab.b<E>, ? extends App<cab.c<E>, cae<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cdz.o), $$3.c(cdz.m), $$3.a(cdz.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     jg $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dx(), (double)$$1);
                     if (!$$8) {
                        bwq.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
