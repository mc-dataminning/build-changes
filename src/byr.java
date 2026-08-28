import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class byr {
   public static <T extends bwb> bxv<bwb> a(bvm<? extends T> $$0, int $$1, cff<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bwb, T extends bwb> bxv<E> a(bvm<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cff<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bwb> $$8 = $$2x -> $$0.equals($$2x.aq()) && $$3.test((T)$$2x);
      return cbh.a(
         (Function<cbh.b<E>, ? extends App<cbh.c<E>, cbk<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cff.n), $$6x.c(cff.m), $$6x.b(cff.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cfh $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bwb> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bvf)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new byf($$5xxxx, true));
                           $$8x.a(new cfi(new byf($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
