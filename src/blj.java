import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blj {
   private static gu a(bja $$0, gu $$1) {
      aru $$2 = $$0.dK().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(aru $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bja> bma<E> a(bsa<gu> $$0, int $$1, float $$2) {
      return boc.a(
         (Function<boc.b<E>, ? extends App<boc.c<E>, bof<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bsa.o), $$3.c(bsa.m), $$3.a(bsa.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     gu $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dk(), (double)$$1);
                     if (!$$8) {
                        bks.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
