import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwy {
   private static jf a(bup $$0, jf $$1) {
      azn $$2 = $$0.dS().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azn $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bup> bxq<E> a(cdq<jf> $$0, int $$1, float $$2) {
      return bzs.a(
         (Function<bzs.b<E>, ? extends App<bzs.c<E>, bzv<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cdq.o), $$3.c(cdq.m), $$3.a(cdq.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     jf $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.ds(), (double)$$1);
                     if (!$$8) {
                        bwh.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
