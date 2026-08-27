import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bln {
   public static <T extends biy> bkr<biy> a(bim<? extends T> $$0, int $$1, bsa<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends biy, T extends biy> bkr<E> a(bim<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, bsa<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<biy> $$8 = $$2x -> $$0.equals($$2x.ag()) && $$3.test((T)$$2x);
      return boc.a(
         (Function<boc.b<E>, ? extends App<boc.c<E>, bof<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(bsa.n), $$6x.c(bsa.m), $$6x.b(bsa.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     bsc $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<biy> $$14 = $$13.a($$3xxxx -> $$3xxxx.f((bii)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new blb($$5xxxx, true));
                           $$8x.a(new bsd(new blb($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
