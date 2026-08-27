import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bls {
   private static gw a(bjk $$0, gw $$1) {
      ase $$2 = $$0.dL().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(ase $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bjk> bmj<E> a(bsj<gw> $$0, int $$1, float $$2) {
      return bol.a(
         (Function<bol.b<E>, ? extends App<bol.c<E>, boo<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bsj.o), $$3.c(bsj.m), $$3.a(bsj.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     gw $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dl(), (double)$$1);
                     if (!$$8) {
                        blb.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
