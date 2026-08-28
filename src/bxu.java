import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxu {
   public static bxb<bvh> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bvh> bxb<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return can.a((Function<can.b<E>, ? extends App<can.c<E>, caq<E>>>)($$4 -> {
         can<E, ? extends cao<? extends K1, ceo>> $$5 = $$2 ? $$4.a(cel.m) : $$4.c(cel.m);
         return $$4.group($$4.a(cel.n), $$5, $$4.b(cel.L), $$4.a(cel.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               clc $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dV().F_().a($$11.dv()) && $$9.fN()) {
                  ceo $$12 = new ceo(new bxl($$11, false), $$1, 0);
                  $$4x.a(new bxl($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
