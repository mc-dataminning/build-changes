import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvd {
   public static <T extends bso> buh<bso> a(bsb<? extends T> $$0, int $$1, cbr<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bso, T extends bso> buh<E> a(bsb<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cbr<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bso> $$8 = $$2x -> $$0.equals($$2x.ak()) && $$3.test((T)$$2x);
      return bxt.a(
         (Function<bxt.b<E>, ? extends App<bxt.c<E>, bxw<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cbr.n), $$6x.c(cbr.m), $$6x.b(cbr.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     cbt $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bso> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((brv)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bur($$5xxxx, true));
                           $$8x.a(new cbu(new bur($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
