import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blh {
   private static gv a(biy $$0, gv $$1) {
      art $$2 = $$0.dK().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(art $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends biy> bly<E> a(bry<gv> $$0, int $$1, float $$2) {
      return boa.a(
         (Function<boa.b<E>, ? extends App<boa.c<E>, bod<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bry.o), $$3.c(bry.m), $$3.a(bry.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     gv $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dk(), (double)$$1);
                     if (!$$8) {
                        bkq.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
