import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzf {
   public static <T extends bwr> byj<bwr> a(bwb<? extends T> $$0, int $$1, cft<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bwr, T extends bwr> byj<E> a(bwb<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cft<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bwr> $$8 = $$2x -> $$0.equals($$2x.aq()) && $$3.test((T)$$2x);
      return cbv.a(
         (Function<cbv.b<E>, ? extends App<cbv.c<E>, cby<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cft.o), $$6x.c(cft.n), $$6x.b(cft.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cfv $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bwr> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bvs)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new byt($$5xxxx, true));
                           $$8x.a(new cfw(new byt($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
