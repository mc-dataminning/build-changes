import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class btq {
   public static bsx<bre> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bre> bsx<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bwj.a((Function<bwj.b<E>, ? extends App<bwj.c<E>, bwm<E>>>)($$4 -> {
         bwj<E, ? extends bwk<? extends K1, cak>> $$5 = $$2 ? $$4.a(cah.m) : $$4.c(cah.m);
         return $$4.group($$4.a(cah.n), $$5, $$4.b(cah.L), $$4.a(cah.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cgv $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dN().C_().a($$11.dn())) {
                  cak $$12 = new cak(new bth($$11, false), $$1, 0);
                  $$4x.a(new bth($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
