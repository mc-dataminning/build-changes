import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwc {
   private static iz a(bts $$0, iz $$1) {
      azh $$2 = $$0.dP().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azh $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bts> bwu<E> a(ccu<iz> $$0, int $$1, float $$2) {
      return byw.a(
         (Function<byw.b<E>, ? extends App<byw.c<E>, byz<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(ccu.o), $$3.c(ccu.m), $$3.a(ccu.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     iz $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dp(), (double)$$1);
                     if (!$$8) {
                        bvl.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
