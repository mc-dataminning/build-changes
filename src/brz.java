import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brz {
   private static ib a(bpq $$0, ib $$1) {
      axd $$2 = $$0.dM().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(axd $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bpq> bsr<E> a(byr<ib> $$0, int $$1, float $$2) {
      return but.a(
         (Function<but.b<E>, ? extends App<but.c<E>, buw<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(byr.o), $$3.c(byr.m), $$3.a(byr.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     ib $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dm(), (double)$$1);
                     if (!$$8) {
                        bri.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
