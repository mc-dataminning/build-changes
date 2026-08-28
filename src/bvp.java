import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvp {
   public static buw<btc> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends btc> buw<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return byi.a((Function<byi.b<E>, ? extends App<byi.c<E>, byl<E>>>)($$4 -> {
         byi<E, ? extends byj<? extends K1, ccj>> $$5 = $$2 ? $$4.a(ccg.m) : $$4.c(ccg.m);
         return $$4.group($$4.a(ccg.n), $$5, $$4.b(ccg.L), $$4.a(ccg.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               civ $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dR().C_().a($$11.dr())) {
                  ccj $$12 = new ccj(new bvg($$11, false), $$1, 0);
                  $$4x.a(new bvg($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
