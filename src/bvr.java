import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvr {
   public static <T extends btb> buv<btb> a(bsm<? extends T> $$0, int $$1, ccf<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends btb, T extends btb> buv<E> a(bsm<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, ccf<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<btb> $$8 = $$2x -> $$0.equals($$2x.al()) && $$3.test((T)$$2x);
      return byh.a(
         (Function<byh.b<E>, ? extends App<byh.c<E>, byk<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(ccf.n), $$6x.c(ccf.m), $$6x.b(ccf.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cch $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<btb> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bsg)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bvf($$5xxxx, true));
                           $$8x.a(new cci(new bvf($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
