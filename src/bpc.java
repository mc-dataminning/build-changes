import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bpc {
   public static <T extends bmo> bog<bmo> a(bmc<? extends T> $$0, int $$1, bvq<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bmo, T extends bmo> bog<E> a(bmc<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, bvq<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bmo> $$8 = $$2x -> $$0.equals($$2x.ai()) && $$3.test((T)$$2x);
      return brs.a(
         (Function<brs.b<E>, ? extends App<brs.c<E>, brv<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(bvq.n), $$6x.c(bvq.m), $$6x.b(bvq.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     bvs $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bmo> $$14 = $$13.a($$3xxxx -> $$3xxxx.f((blw)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new boq($$5xxxx, true));
                           $$8x.a(new bvt(new boq($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
