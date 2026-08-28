import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwa {
   public static <T extends btk> bve<btk> a(bsv<? extends T> $$0, int $$1, cco<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends btk, T extends btk> bve<E> a(bsv<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cco<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<btk> $$8 = $$2x -> $$0.equals($$2x.ak()) && $$3.test((T)$$2x);
      return byq.a(
         (Function<byq.b<E>, ? extends App<byq.c<E>, byt<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cco.n), $$6x.c(cco.m), $$6x.b(cco.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     ccq $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<btk> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bsp)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bvo($$5xxxx, true));
                           $$8x.a(new ccr(new bvo($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
