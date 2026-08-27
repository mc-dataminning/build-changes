import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bow {
   public static bod<bml> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bml> bod<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return brp.a((Function<brp.b<E>, ? extends App<brp.c<E>, brs<E>>>)($$4 -> {
         brp<E, ? extends brq<? extends K1, bvq>> $$5 = $$2 ? $$4.a(bvn.m) : $$4.c(bvn.m);
         return $$4.group($$4.a(bvn.n), $$5, $$4.b(bvn.K), $$4.a(bvn.aO)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cbu $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dM().D_().a($$11.dm())) {
                  bvq $$12 = new bvq(new bon($$11, false), $$1, 0);
                  $$4x.a(new bon($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
