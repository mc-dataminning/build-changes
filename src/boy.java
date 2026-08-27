import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class boy {
   private static hx a(bmq $$0, hx $$1) {
      auw $$2 = $$0.dL().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(auw $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bmq> bpq<E> a(bvq<hx> $$0, int $$1, float $$2) {
      return brs.a(
         (Function<brs.b<E>, ? extends App<brs.c<E>, brv<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bvq.o), $$3.c(bvq.m), $$3.a(bvq.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     hx $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dl(), (double)$$1);
                     if (!$$8) {
                        boh.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
