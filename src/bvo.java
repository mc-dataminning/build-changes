import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvo {
   public static <T extends bsy> bus<bsy> a(bsj<? extends T> $$0, int $$1, ccc<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bsy, T extends bsy> bus<E> a(bsj<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, ccc<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bsy> $$8 = $$2x -> $$0.equals($$2x.ak()) && $$3.test((T)$$2x);
      return bye.a(
         (Function<bye.b<E>, ? extends App<bye.c<E>, byh<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(ccc.n), $$6x.c(ccc.m), $$6x.b(ccc.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cce $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bsy> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bsd)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bvc($$5xxxx, true));
                           $$8x.a(new ccf(new bvc($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
