import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class btf {
   public static bsm<bqt> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bqt> bsm<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return bvy.a((Function<bvy.b<E>, ? extends App<bvy.c<E>, bwb<E>>>)($$4 -> {
         bvy<E, ? extends bvz<? extends K1, bzz>> $$5 = $$2 ? $$4.a(bzw.m) : $$4.c(bzw.m);
         return $$4.group($$4.a(bzw.n), $$5, $$4.b(bzw.L), $$4.a(bzw.aP)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               cgk $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dM().C_().a($$11.dm())) {
                  bzz $$12 = new bzz(new bsw($$11, false), $$1, 0);
                  $$4x.a(new bsw($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
