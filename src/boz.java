import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class boz {
   public static bog<bmo> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bmo> bog<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return brs.a((Function<brs.b<E>, ? extends App<brs.c<E>, brv<E>>>)($$4 -> {
         brs<E, ? extends brt<? extends K1, bvt>> $$5 = $$2 ? $$4.a(bvq.m) : $$4.c(bvq.m);
         return $$4.group($$4.a(bvq.n), $$5, $$4.b(bvq.L), $$4.a(bvq.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               ccb $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dL().D_().a($$11.dl())) {
                  bvt $$12 = new bvt(new boq($$11, false), $$1, 0);
                  $$4x.a(new boq($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
