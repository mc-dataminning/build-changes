import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class byo {
   public static <T extends bvy> bxs<bvy> a(bvi<? extends T> $$0, int $$1, cfc<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bvy, T extends bvy> bxs<E> a(bvi<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cfc<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bvy> $$8 = $$2x -> $$0.equals($$2x.aq()) && $$3.test((T)$$2x);
      return cbe.a(
         (Function<cbe.b<E>, ? extends App<cbe.c<E>, cbh<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cfc.n), $$6x.c(cfc.m), $$6x.b(cfc.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cfe $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bvy> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bva)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new byc($$5xxxx, true));
                           $$8x.a(new cff(new byc($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
