import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxq {
   public static <T extends bva> bwu<bva> a(bul<? extends T> $$0, int $$1, cee<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bva, T extends bva> bwu<E> a(bul<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cee<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bva> $$8 = $$2x -> $$0.equals($$2x.ar()) && $$3.test((T)$$2x);
      return cag.a(
         (Function<cag.b<E>, ? extends App<cag.c<E>, caj<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cee.n), $$6x.c(cee.m), $$6x.b(cee.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     ceg $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bva> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bue)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bxe($$5xxxx, true));
                           $$8x.a(new ceh(new bxe($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
