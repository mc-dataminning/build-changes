import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bri {
   private static ib a(boz $$0, ib $$1) {
      awt $$2 = $$0.dJ().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(awt $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends boz> bsa<E> a(bya<ib> $$0, int $$1, float $$2) {
      return buc.a(
         (Function<buc.b<E>, ? extends App<buc.c<E>, buf<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bya.o), $$3.c(bya.m), $$3.a(bya.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     ib $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dj(), (double)$$1);
                     if (!$$8) {
                        bqr.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
