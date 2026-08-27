import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bma {
   public static <T extends bjm> ble<bjm> a(bja<? extends T> $$0, int $$1, bsn<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bjm, T extends bjm> ble<E> a(bja<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, bsn<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bjm> $$8 = $$2x -> $$0.equals($$2x.ag()) && $$3.test((T)$$2x);
      return bop.a(
         (Function<bop.b<E>, ? extends App<bop.c<E>, bos<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(bsn.n), $$6x.c(bsn.m), $$6x.b(bsn.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     bsp $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bjm> $$14 = $$13.a($$3xxxx -> $$3xxxx.f((biw)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new blo($$5xxxx, true));
                           $$8x.a(new bsq(new blo($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
