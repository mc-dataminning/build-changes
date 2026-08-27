import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnr {
   public static bmy<blg> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends blg> bmy<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bqj.a((Function<bqj.b<E>, ? extends App<bqj.c<E>, bqm<E>>>)($$4 -> {
         bqj<E, ? extends bqk<? extends K1, buk>> $$5 = $$2 ? $$4.a(buh.m) : $$4.c(buh.m);
         return $$4.group($$4.a(buh.n), $$5, $$4.b(buh.K), $$4.a(buh.aO)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               can $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dN().C_().a($$11.dn())) {
                  buk $$12 = new buk(new bni($$11, false), $$1, 0);
                  $$4x.a(new bni($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
