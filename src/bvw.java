import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvw {
   private static iz a(btm $$0, iz $$1) {
      azc $$2 = $$0.dP().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(azc $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends btm> bwo<E> a(cco<iz> $$0, int $$1, float $$2) {
      return byq.a(
         (Function<byq.b<E>, ? extends App<byq.c<E>, byt<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cco.o), $$3.c(cco.m), $$3.a(cco.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     iz $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dp(), (double)$$1);
                     if (!$$8) {
                        bvf.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
