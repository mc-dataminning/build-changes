import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxx {
   public static <T extends bvh> bxb<bvh> a(bus<? extends T> $$0, int $$1, cel<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bvh, T extends bvh> bxb<E> a(bus<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cel<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bvh> $$8 = $$2x -> $$0.equals($$2x.aq()) && $$3.test((T)$$2x);
      return can.a(
         (Function<can.b<E>, ? extends App<can.c<E>, caq<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cel.n), $$6x.c(cel.m), $$6x.b(cel.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cen $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bvh> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bul)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bxl($$5xxxx, true));
                           $$8x.a(new ceo(new bxl($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
