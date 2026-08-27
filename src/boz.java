import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class boz {
   public static <T extends bml> bod<bml> a(blz<? extends T> $$0, int $$1, bvn<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bml, T extends bml> bod<E> a(blz<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, bvn<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bml> $$8 = $$2x -> $$0.equals($$2x.ai()) && $$3.test((T)$$2x);
      return brp.a(
         (Function<brp.b<E>, ? extends App<brp.c<E>, brs<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(bvn.n), $$6x.c(bvn.m), $$6x.b(bvn.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     bvp $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bml> $$14 = $$13.a($$3xxxx -> $$3xxxx.f((blv)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bon($$5xxxx, true));
                           $$8x.a(new bvq(new bon($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
