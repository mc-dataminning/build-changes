import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class boq {
   public static bnx<bmf> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bmf> bnx<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return brj.a((Function<brj.b<E>, ? extends App<brj.c<E>, brm<E>>>)($$4 -> {
         brj<E, ? extends brk<? extends K1, bvk>> $$5 = $$2 ? $$4.a(bvh.m) : $$4.c(bvh.m);
         return $$4.group($$4.a(bvh.n), $$5, $$4.b(bvh.K), $$4.a(bvh.aO)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cbo $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dM().D_().a($$11.dm())) {
                  bvk $$12 = new bvk(new boh($$11, false), $$1, 0);
                  $$4x.a(new boh($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
