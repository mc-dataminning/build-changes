import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class btp {
   private static im a(brg $$0, im $$1) {
      ayd $$2 = $$0.dN().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(ayd $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends brg> buh<E> a(cah<im> $$0, int $$1, float $$2) {
      return bwj.a(
         (Function<bwj.b<E>, ? extends App<bwj.c<E>, bwm<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(cah.o), $$3.c(cah.m), $$3.a(cah.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     im $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dn(), (double)$$1);
                     if (!$$8) {
                        bsy.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
