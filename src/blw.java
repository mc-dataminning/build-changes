import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blw {
   private static gw a(bjo $$0, gw $$1) {
      ash $$2 = $$0.dL().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(ash $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bjo> bmn<E> a(bsn<gw> $$0, int $$1, float $$2) {
      return bop.a(
         (Function<bop.b<E>, ? extends App<bop.c<E>, bos<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(bsn.o), $$3.c(bsn.m), $$3.a(bsn.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     gw $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dl(), (double)$$1);
                     if (!$$8) {
                        blf.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
