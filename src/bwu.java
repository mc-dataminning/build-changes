import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwu {
   public static <T extends buf> bvy<buf> a(btq<? extends T> $$0, int $$1, cdi<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends buf, T extends buf> bvy<E> a(btq<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cdi<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<buf> $$8 = $$2x -> $$0.equals($$2x.ao()) && $$3.test((T)$$2x);
      return bzk.a(
         (Function<bzk.b<E>, ? extends App<bzk.c<E>, bzn<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cdi.n), $$6x.c(cdi.m), $$6x.b(cdi.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cdk $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<buf> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((btj)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bwi($$5xxxx, true));
                           $$8x.a(new cdl(new bwi($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
