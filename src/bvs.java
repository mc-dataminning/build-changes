import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvs {
   public static <T extends btc> buw<btc> a(bsn<? extends T> $$0, int $$1, ccg<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends btc, T extends btc> buw<E> a(bsn<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, ccg<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<btc> $$8 = $$2x -> $$0.equals($$2x.am()) && $$3.test((T)$$2x);
      return byi.a(
         (Function<byi.b<E>, ? extends App<byi.c<E>, byl<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(ccg.n), $$6x.c(ccg.m), $$6x.b(ccg.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cci $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<btc> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bsh)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bvg($$5xxxx, true));
                           $$8x.a(new ccj(new bvg($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
