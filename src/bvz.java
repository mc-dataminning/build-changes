import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvz {
   private static iz a(btp $$0, iz $$1) {
      azf $$2 = $$0.dP().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azf $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends btp> bwr<E> a(ccr<iz> $$0, int $$1, float $$2) {
      return byt.a(
         (Function<byt.b<E>, ? extends App<byt.c<E>, byw<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(ccr.o), $$3.c(ccr.m), $$3.a(ccr.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     iz $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dp(), (double)$$1);
                     if (!$$8) {
                        bvi.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
