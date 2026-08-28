import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cak {
   public static <T extends bxw> bzo<bxw> a(bxe<? extends T> $$0, int $$1, cgy<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bxw, T extends bxw> bzo<E> a(bxe<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cgy<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bxw> $$8 = $$2x -> $$0.equals($$2x.an()) && $$3.test((T)$$2x);
      return cda.a(
         (Function<cda.b<E>, ? extends App<cda.c<E>, cdd<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cgy.o), $$6x.c(cgy.n), $$6x.b(cgy.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cha $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bxw> $$14 = $$13.a($$3xxxx -> $$3xxxx.g($$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bzy($$5xxxx, true));
                           $$8x.a(new chb(new bzy($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
