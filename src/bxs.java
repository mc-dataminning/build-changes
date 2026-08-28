import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxs {
   private static ji a(bvi $$0, ji $$1) {
      azh $$2 = $$0.dW().A;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azh $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bvi> byk<E> a(cek<ji> $$0, int $$1, float $$2) {
      return cam.a(
         (Function<cam.b<E>, ? extends App<cam.c<E>, cap<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cek.o), $$3.c(cek.m), $$3.a(cek.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     ji $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dw(), (double)$$1);
                     if (!$$8) {
                        bxb.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
