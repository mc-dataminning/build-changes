import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvo {
   public static buv<btb> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends btb> buv<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return byh.a((Function<byh.b<E>, ? extends App<byh.c<E>, byk<E>>>)($$4 -> {
         byh<E, ? extends byi<? extends K1, cci>> $$5 = $$2 ? $$4.a(ccf.m) : $$4.c(ccf.m);
         return $$4.group($$4.a(ccf.n), $$5, $$4.b(ccf.L), $$4.a(ccf.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               ciu $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dQ().C_().a($$11.dq())) {
                  cci $$12 = new cci(new bvf($$11, false), $$1, 0);
                  $$4x.a(new bvf($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
