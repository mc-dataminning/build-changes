import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bva {
   private static io a(bsq $$0, io $$1) {
      ayk $$2 = $$0.dP().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(ayk $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bsq> bvs<E> a(cbs<io> $$0, int $$1, float $$2) {
      return bxu.a(
         (Function<bxu.b<E>, ? extends App<bxu.c<E>, bxx<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cbs.o), $$3.c(cbs.m), $$3.a(cbs.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     io $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dp(), (double)$$1);
                     if (!$$8) {
                        buj.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
