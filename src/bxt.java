import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxt {
   private static jh a(bvj $$0, jh $$1) {
      azu $$2 = $$0.dV().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azu $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bvj> byl<E> a(cel<jh> $$0, int $$1, float $$2) {
      return can.a(
         (Function<can.b<E>, ? extends App<can.c<E>, caq<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cel.o), $$3.c(cel.m), $$3.a(cel.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     jh $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dv(), (double)$$1);
                     if (!$$8) {
                        bxc.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
