import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxu {
   private static ji a(bvk $$0, ji $$1) {
      azh $$2 = $$0.dV().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azh $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bvk> bym<E> a(cem<ji> $$0, int $$1, float $$2) {
      return cao.a(
         (Function<cao.b<E>, ? extends App<cao.c<E>, car<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cem.o), $$3.c(cem.m), $$3.a(cem.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     ji $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dv(), (double)$$1);
                     if (!$$8) {
                        bxd.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
