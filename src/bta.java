import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class bta {
   public static bsh<bqo> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bqo> bsh<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bvt.a((Function<bvt.b<E>, ? extends App<bvt.c<E>, bvw<E>>>)($$4 -> {
         bvt<E, ? extends bvu<? extends K1, bzu>> $$5 = $$2 ? $$4.a(bzr.m) : $$4.c(bzr.m);
         return $$4.group($$4.a(bzr.n), $$5, $$4.b(bzr.L), $$4.a(bzr.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cgd $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dM().C_().a($$11.dm())) {
                  bzu $$12 = new bzu(new bsr($$11, false), $$1, 0);
                  $$4x.a(new bsr($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
