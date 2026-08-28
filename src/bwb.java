import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwb {
   public static bvi<btn> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends btn> bvi<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return byu.a((Function<byu.b<E>, ? extends App<byu.c<E>, byx<E>>>)($$4 -> {
         byu<E, ? extends byv<? extends K1, ccv>> $$5 = $$2 ? $$4.a(ccs.m) : $$4.c(ccs.m);
         return $$4.group($$4.a(ccs.n), $$5, $$4.b(ccs.L), $$4.a(ccs.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cjh $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dP().C_().a($$11.dp())) {
                  ccv $$12 = new ccv(new bvs($$11, false), $$1, 0);
                  $$4x.a(new bvs($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
