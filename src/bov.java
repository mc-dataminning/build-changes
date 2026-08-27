import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bov {
   public static boc<bmk> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bmk> boc<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bro.a((Function<bro.b<E>, ? extends App<bro.c<E>, brr<E>>>)($$4 -> {
         bro<E, ? extends brp<? extends K1, bvp>> $$5 = $$2 ? $$4.a(bvm.m) : $$4.c(bvm.m);
         return $$4.group($$4.a(bvm.n), $$5, $$4.b(bvm.K), $$4.a(bvm.aO)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cbt $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dM().D_().a($$11.dm())) {
                  bvp $$12 = new bvp(new bom($$11, false), $$1, 0);
                  $$4x.a(new bom($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
