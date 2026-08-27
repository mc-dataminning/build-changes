import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bse {
   public static <T extends bpp> bri<bpp> a(bpd<? extends T> $$0, int $$1, bys<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bpp, T extends bpp> bri<E> a(bpd<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, bys<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bpp> $$8 = $$2x -> $$0.equals($$2x.ai()) && $$3.test((T)$$2x);
      return buu.a(
         (Function<buu.b<E>, ? extends App<buu.c<E>, bux<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(bys.n), $$6x.c(bys.m), $$6x.b(bys.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     byu $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bpp> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((box)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new brs($$5xxxx, true));
                           $$8x.a(new byv(new brs($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
