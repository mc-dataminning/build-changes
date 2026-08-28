import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byr {
   private static jh a(bwh $$0, jh $$1) {
      bam $$2 = $$0.dW().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(bam $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bwh> bzj<E> a(cfj<jh> $$0, int $$1, float $$2) {
      return cbl.a(
         (Function<cbl.b<E>, ? extends App<cbl.c<E>, cbo<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cfj.o), $$3.c(cfj.m), $$3.a(cfj.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     jh $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dw(), (double)$$1);
                     if (!$$8) {
                        bya.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
