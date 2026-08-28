import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzt {
   private static iv a(bxl $$0, iv $$1) {
      azv $$2 = $$0.dU().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azv $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bxl> cal<E> a(cgl<iv> $$0, int $$1, float $$2) {
      return ccn.a(
         (Function<ccn.b<E>, ? extends App<ccn.c<E>, ccq<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cgl.p), $$3.c(cgl.n), $$3.a(cgl.o))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     iv $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.du(), (double)$$1);
                     if (!$$8) {
                        bzc.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
