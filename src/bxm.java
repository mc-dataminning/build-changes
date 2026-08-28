import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxm {
   private static jh a(bvc $$0, jh $$1) {
      azs $$2 = $$0.dX().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azs $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bvc> bye<E> a(cee<jh> $$0, int $$1, float $$2) {
      return cag.a(
         (Function<cag.b<E>, ? extends App<cag.c<E>, caj<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cee.o), $$3.c(cee.m), $$3.a(cee.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     jh $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dx(), (double)$$1);
                     if (!$$8) {
                        bwv.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
