import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwd {
   public static <T extends btn> bvh<btn> a(bsy<? extends T> $$0, int $$1, ccr<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends btn, T extends btn> bvh<E> a(bsy<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, ccr<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<btn> $$8 = $$2x -> $$0.equals($$2x.ak()) && $$3.test((T)$$2x);
      return byt.a(
         (Function<byt.b<E>, ? extends App<byt.c<E>, byw<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(ccr.n), $$6x.c(ccr.m), $$6x.b(ccr.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cct $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<btn> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bss)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bvr($$5xxxx, true));
                           $$8x.a(new ccu(new bvr($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
