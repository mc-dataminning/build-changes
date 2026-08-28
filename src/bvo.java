import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvo {
   private static ja a(bte $$0, ja $$1) {
      ayo $$2 = $$0.dR().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(ayo $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bte> bwg<E> a(ccg<ja> $$0, int $$1, float $$2) {
      return byi.a(
         (Function<byi.b<E>, ? extends App<byi.c<E>, byl<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(ccg.o), $$3.c(ccg.m), $$3.a(ccg.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     ja $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dr(), (double)$$1);
                     if (!$$8) {
                        bux.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
