import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxu {
   public static <T extends bve> bwy<bve> a(bup<? extends T> $$0, int $$1, cei<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bve, T extends bve> bwy<E> a(bup<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cei<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bve> $$8 = $$2x -> $$0.equals($$2x.ar()) && $$3.test((T)$$2x);
      return cak.a(
         (Function<cak.b<E>, ? extends App<cak.c<E>, can<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cei.n), $$6x.c(cei.m), $$6x.b(cei.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cek $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bve> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bui)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bxi($$5xxxx, true));
                           $$8x.a(new cel(new bxi($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
