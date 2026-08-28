import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzj {
   private static iu a(bxb $$0, iu $$1) {
      azt $$2 = $$0.dV().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azt $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bxb> cab<E> a(cgb<iu> $$0, int $$1, float $$2) {
      return ccd.a(
         (Function<ccd.b<E>, ? extends App<ccd.c<E>, ccg<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cgb.p), $$3.c(cgb.n), $$3.a(cgb.o))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     iu $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dv(), (double)$$1);
                     if (!$$8) {
                        bys.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
