import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class byk {
   public static bxr<bvx> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bvx> bxr<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return cbd.a((Function<cbd.b<E>, ? extends App<cbd.c<E>, cbg<E>>>)($$4 -> {
         cbd<E, ? extends cbe<? extends K1, cfe>> $$5 = $$2 ? $$4.a(cfb.m) : $$4.c(cfb.m);
         return $$4.group($$4.a(cfb.n), $$5, $$4.b(cfb.L), $$4.a(cfb.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cls $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dW().F_().a($$11.dw()) && $$9.fN()) {
                  cfe $$12 = new cfe(new byb($$11, false), $$1, 0);
                  $$4x.a(new byb($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
