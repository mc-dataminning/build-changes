import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bsd {
   public static <T extends bpo> brh<bpo> a(bpc<? extends T> $$0, int $$1, byr<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bpo, T extends bpo> brh<E> a(bpc<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, byr<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bpo> $$8 = $$2x -> $$0.equals($$2x.ai()) && $$3.test((T)$$2x);
      return but.a(
         (Function<but.b<E>, ? extends App<but.c<E>, buw<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(byr.n), $$6x.c(byr.m), $$6x.b(byr.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     byt $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bpo> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bow)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new brr($$5xxxx, true));
                           $$8x.a(new byu(new brr($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
