import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bti {
   public static <T extends bqt> bsm<bqt> a(bqg<? extends T> $$0, int $$1, bzw<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bqt, T extends bqt> bsm<E> a(bqg<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, bzw<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bqt> $$8 = $$2x -> $$0.equals($$2x.ai()) && $$3.test((T)$$2x);
      return bvy.a(
         (Function<bvy.b<E>, ? extends App<bvy.c<E>, bwb<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(bzw.n), $$6x.c(bzw.m), $$6x.b(bzw.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     bzy $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bqt> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bqa)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bsw($$5xxxx, true));
                           $$8x.a(new bzz(new bsw($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
