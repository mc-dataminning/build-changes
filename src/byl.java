import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class byl {
   public static bxs<bvy> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bvy> bxs<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return cbe.a((Function<cbe.b<E>, ? extends App<cbe.c<E>, cbh<E>>>)($$4 -> {
         cbe<E, ? extends cbf<? extends K1, cff>> $$5 = $$2 ? $$4.a(cfc.m) : $$4.c(cfc.m);
         return $$4.group($$4.a(cfc.n), $$5, $$4.b(cfc.L), $$4.a(cfc.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               clw $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dU().A_().a($$11.du()) && $$9.fP()) {
                  cff $$12 = new cff(new byc($$11, false), $$1, 0);
                  $$4x.a(new byc($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
