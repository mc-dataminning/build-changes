import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class byo {
   public static bxv<bwb> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bwb> bxv<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return cbh.a((Function<cbh.b<E>, ? extends App<cbh.c<E>, cbk<E>>>)($$4 -> {
         cbh<E, ? extends cbi<? extends K1, cfi>> $$5 = $$2 ? $$4.a(cff.m) : $$4.c(cff.m);
         return $$4.group($$4.a(cff.n), $$5, $$4.b(cff.L), $$4.a(cff.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               clw $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dV().F_().a($$11.dv()) && $$9.fL()) {
                  cfi $$12 = new cfi(new byf($$11, false), $$1, 0);
                  $$4x.a(new byf($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
