import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwc {
   public static bvj<btp> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends btp> bvj<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return byv.a((Function<byv.b<E>, ? extends App<byv.c<E>, byy<E>>>)($$4 -> {
         byv<E, ? extends byw<? extends K1, ccw>> $$5 = $$2 ? $$4.a(cct.m) : $$4.c(cct.m);
         return $$4.group($$4.a(cct.n), $$5, $$4.b(cct.L), $$4.a(cct.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cjh $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dP().C_().a($$11.dp())) {
                  ccw $$12 = new ccw(new bvt($$11, false), $$1, 0);
                  $$4x.a(new bvt($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
