import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxc {
   public static <T extends bun> bwg<bun> a(bty<? extends T> $$0, int $$1, cdq<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bun, T extends bun> bwg<E> a(bty<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cdq<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bun> $$8 = $$2x -> $$0.equals($$2x.ao()) && $$3.test((T)$$2x);
      return bzs.a(
         (Function<bzs.b<E>, ? extends App<bzs.c<E>, bzv<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cdq.n), $$6x.c(cdq.m), $$6x.b(cdq.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cds $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bun> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((btr)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bwq($$5xxxx, true));
                           $$8x.a(new cdt(new bwq($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
