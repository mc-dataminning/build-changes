import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwd {
   public static bvk<btq> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends btq> bvk<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return byw.a((Function<byw.b<E>, ? extends App<byw.c<E>, byz<E>>>)($$4 -> {
         byw<E, ? extends byx<? extends K1, ccx>> $$5 = $$2 ? $$4.a(ccu.m) : $$4.c(ccu.m);
         return $$4.group($$4.a(ccu.n), $$5, $$4.b(ccu.L), $$4.a(ccu.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cji $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dP().C_().a($$11.dp())) {
                  ccx $$12 = new ccx(new bvu($$11, false), $$1, 0);
                  $$4x.a(new bvu($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
