import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bni {
   private static ht a(bla $$0, ht $$1) {
      ato $$2 = $$0.dL().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(ato $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bla> bnz<E> a(btz<ht> $$0, int $$1, float $$2) {
      return bqb.a(
         (Function<bqb.b<E>, ? extends App<bqb.c<E>, bqe<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(btz.o), $$3.c(btz.m), $$3.a(btz.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     ht $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dl(), (double)$$1);
                     if (!$$8) {
                        bmr.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
