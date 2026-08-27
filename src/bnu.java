import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnu {
   public static <T extends blg> bmy<blg> a(bku<? extends T> $$0, int $$1, buh<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends blg, T extends blg> bmy<E> a(bku<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, buh<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<blg> $$8 = $$2x -> $$0.equals($$2x.ai()) && $$3.test((T)$$2x);
      return bqj.a(
         (Function<bqj.b<E>, ? extends App<bqj.c<E>, bqm<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(buh.n), $$6x.c(buh.m), $$6x.b(buh.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     buj $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<blg> $$14 = $$13.a($$3xxxx -> $$3xxxx.f((bkq)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bni($$5xxxx, true));
                           $$8x.a(new buk(new bni($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
