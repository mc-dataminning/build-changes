import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class brm {
   public static <T extends box> bqq<box> a(bol<? extends T> $$0, int $$1, bya<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends box, T extends box> bqq<E> a(bol<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, bya<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<box> $$8 = $$2x -> $$0.equals($$2x.ai()) && $$3.test((T)$$2x);
      return buc.a(
         (Function<buc.b<E>, ? extends App<buc.c<E>, buf<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(bya.n), $$6x.c(bya.m), $$6x.b(bya.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     byc $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<box> $$14 = $$13.a($$3xxxx -> $$3xxxx.f((bof)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bra($$5xxxx, true));
                           $$8x.a(new byd(new bra($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
