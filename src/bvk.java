import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvk {
   private static ja a(bta $$0, ja $$1) {
      aym $$2 = $$0.dP().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(aym $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bta> bwc<E> a(ccc<ja> $$0, int $$1, float $$2) {
      return bye.a(
         (Function<bye.b<E>, ? extends App<bye.c<E>, byh<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(ccc.o), $$3.c(ccc.m), $$3.a(ccc.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     ja $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dp(), (double)$$1);
                     if (!$$8) {
                        but.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
