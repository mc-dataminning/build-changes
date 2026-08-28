import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvn {
   private static ja a(btd $$0, ja $$1) {
      ayo $$2 = $$0.dQ().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(ayo $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends btd> bwf<E> a(ccf<ja> $$0, int $$1, float $$2) {
      return byh.a(
         (Function<byh.b<E>, ? extends App<byh.c<E>, byk<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(ccf.o), $$3.c(ccf.m), $$3.a(ccf.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     ja $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dq(), (double)$$1);
                     if (!$$8) {
                        buw.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
