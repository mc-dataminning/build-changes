import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bul {
   private static in a(bsc $$0, in $$1) {
      ayg $$2 = $$0.dN().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(ayg $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bsc> bvd<E> a(cbd<in> $$0, int $$1, float $$2) {
      return bxf.a(
         (Function<bxf.b<E>, ? extends App<bxf.c<E>, bxi<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cbd.o), $$3.c(cbd.m), $$3.a(cbd.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     in $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dn(), (double)$$1);
                     if (!$$8) {
                        btu.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
