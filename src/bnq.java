import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnq {
   private static ht a(bli $$0, ht $$1) {
      ats $$2 = $$0.dN().z;
      return $$1.b(a($$2), 0, a($$2));
   }

   private static int a(ats $$0) {
      return $$0.a(3) - 1;
   }

   public static <E extends bli> boh<E> a(buh<ht> $$0, int $$1, float $$2) {
      return bqj.a(
         (Function<bqj.b<E>, ? extends App<bqj.c<E>, bqm<E>>>)($$3 -> $$3.group($$3.b($$0), $$3.c(buh.o), $$3.c(buh.m), $$3.a(buh.n))
               .apply($$3, ($$3x, $$4, $$5, $$6) -> ($$4x, $$5x, $$6x) -> {
                     ht $$7 = $$3.b($$3x);
                     boolean $$8 = $$7.a($$5x.dn(), (double)$$1);
                     if (!$$8) {
                        bmz.a($$5x, a($$5x, $$7), $$2, $$1);
                     }

                     return true;
                  }))
      );
   }
}
