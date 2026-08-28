import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwa {
   public static bvh<btn> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends btn> bvh<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return byt.a((Function<byt.b<E>, ? extends App<byt.c<E>, byw<E>>>)($$4 -> {
         byt<E, ? extends byu<? extends K1, ccu>> $$5 = $$2 ? $$4.a(ccr.m) : $$4.c(ccr.m);
         return $$4.group($$4.a(ccr.n), $$5, $$4.b(ccr.L), $$4.a(ccr.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cjf $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dP().C_().a($$11.dp())) {
                  ccu $$12 = new ccu(new bvr($$11, false), $$1, 0);
                  $$4x.a(new bvr($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
