import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cap {
   private static iw a(byh $$0, iw $$1) {
      bai $$2 = $$0.dV().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(bai $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends byh> cbh<E> a(chh<iw> $$0, int $$1, float $$2) {
      return cdj.a(
         (Function<cdj.b<E>, ? extends App<cdj.c<E>, cdm<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(chh.p), $$3.c(chh.n), $$3.a(chh.o))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     iw $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dv(), (double)$$1);
                     if (!$$8) {
                        bzy.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
