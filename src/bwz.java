import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwz {
   public static <T extends buk> bwd<buk> a(btv<? extends T> $$0, int $$1, cdn<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends buk, T extends buk> bwd<E> a(btv<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cdn<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<buk> $$8 = $$2x -> $$0.equals($$2x.ao()) && $$3.test((T)$$2x);
      return bzp.a(
         (Function<bzp.b<E>, ? extends App<bzp.c<E>, bzs<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cdn.n), $$6x.c(cdn.m), $$6x.b(cdn.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cdp $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<buk> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bto)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bwn($$5xxxx, true));
                           $$8x.a(new cdq(new bwn($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
