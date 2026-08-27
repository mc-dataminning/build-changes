import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.K1;
import java.util.function.Function;
import java.util.function.Predicate;

public class blm {
   public static bkt<bjb> a(float $$0, boolean $$1, int $$2) {
      return a($$0x -> true, $$0, $$1, $$2);
   }

   public static <E extends bjb> bkt<E> a(Predicate<E> $$0, float $$1, boolean $$2, int $$3) {
      return boe.a((Function<boe.b<E>, ? extends App<boe.c<E>, boh<E>>>)($$4 -> {
         boe<E, ? extends bof<? extends K1, bsf>> $$5 = $$2 ? $$4.a(bsc.m) : $$4.c(bsc.m);
         return $$4.group($$4.a(bsc.n), $$5, $$4.b(bsc.K), $$4.a(bsc.aO)).apply($$4, ($$4x, $$5x, $$6, $$7) -> ($$8, $$9, $$10) -> {
               byi $$11 = $$4.b($$6);
               if ($$4.a($$7).isEmpty() && $$0.test((E)$$9) && $$11.a($$9, (double)$$3) && $$9.dK().w_().a($$11.dk())) {
                  bsf $$12 = new bsf(new bld($$11, false), $$1, 0);
                  $$4x.a(new bld($$11, true));
                  $$5x.a($$12);
                  return true;
               } else {
                  return false;
               }
            });
      }));
   }
}
