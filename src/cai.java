import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cai {
   public static <T extends bxu> bzm<bxu> a(bxc<? extends T> $$0, int $$1, cgw<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bxu, T extends bxu> bzm<E> a(bxc<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cgw<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bxu> $$8 = $$2x -> $$0.equals($$2x.an()) && $$3.test((T)$$2x);
      return ccy.a(
         (Function<ccy.b<E>, ? extends App<ccy.c<E>, cdb<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cgw.o), $$6x.c(cgw.n), $$6x.b(cgw.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cgy $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bxu> $$14 = $$13.a($$3xxxx -> $$3xxxx.g($$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bzw($$5xxxx, true));
                           $$8x.a(new cgz(new bzw($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
