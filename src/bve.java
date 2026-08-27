import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bve {
   public static <T extends bso> bui<bso> a(bsa<? extends T> $$0, int $$1, cbs<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bso, T extends bso> bui<E> a(bsa<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cbs<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bso> $$8 = $$2x -> $$0.equals($$2x.ak()) && $$3.test((T)$$2x);
      return bxu.a(
         (Function<bxu.b<E>, ? extends App<bxu.c<E>, bxx<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cbs.n), $$6x.c(cbs.m), $$6x.b(cbs.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cbu $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bso> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bru)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bus($$5xxxx, true));
                           $$8x.a(new cbv(new bus($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
