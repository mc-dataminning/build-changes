import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cag {
   private static iw a(bxy $$0, iw $$1) {
      azz $$2 = $$0.dV().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azz $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bxy> cay<E> a(cgy<iw> $$0, int $$1, float $$2) {
      return cda.a(
         (Function<cda.b<E>, ? extends App<cda.c<E>, cdd<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cgy.p), $$3.c(cgy.n), $$3.a(cgy.o))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     iw $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dv(), (double)$$1);
                     if (!$$8) {
                        bzp.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
