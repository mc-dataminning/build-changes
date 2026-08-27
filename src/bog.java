import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bog {
   public static bnn<blv> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends blv> bnn<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bqz.a((Function<bqz.b<E>, ? extends App<bqz.c<E>, brc<E>>>)($$4 -> {
         bqz<E, ? extends bra<? extends K1, bva>> $$5 = $$2 ? $$4.a(bux.m) : $$4.c(bux.m);
         return $$4.group($$4.a(bux.n), $$5, $$4.b(bux.K), $$4.a(bux.aO)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cbe $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dM().D_().a($$11.dm())) {
                  bva $$12 = new bva(new bnx($$11, false), $$1, 0);
                  $$4x.a(new bnx($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
