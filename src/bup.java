import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bup {
   public static <T extends bsa> btt<bsa> a(brn<? extends T> $$0, int $$1, cbd<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bsa, T extends bsa> btt<E> a(brn<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cbd<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bsa> $$8 = $$2x -> $$0.equals($$2x.ai()) && $$3.test((T)$$2x);
      return bxf.a(
         (Function<bxf.b<E>, ? extends App<bxf.c<E>, bxi<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cbd.n), $$6x.c(cbd.m), $$6x.b(cbd.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cbf $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bsa> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((brh)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bud($$5xxxx, true));
                           $$8x.a(new cbg(new bud($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
