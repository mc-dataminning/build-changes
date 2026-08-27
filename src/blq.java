import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blq {
   private static gw a(bji $$0, gw $$1) {
      asc $$2 = $$0.dL().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(asc $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bji> bmh<E> a(bsh<gw> $$0, int $$1, float $$2) {
      return boj.a(
         (Function<boj.b<E>, ? extends App<boj.c<E>, bom<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bsh.o), $$3.c(bsh.m), $$3.a(bsh.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     gw $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dl(), (double)$$1);
                     if (!$$8) {
                        bkz.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
