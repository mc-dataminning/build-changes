import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxy {
   public static <T extends bvi> bxc<bvi> a(but<? extends T> $$0, int $$1, cem<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends bvi, T extends bvi> bxc<E> a(but<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, cem<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<bvi> $$8 = $$2x -> $$0.equals($$2x.aq()) && $$3.test((T)$$2x);
      return cao.a(
         (Function<cao.b<E>, ? extends App<cao.c<E>, car<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(cem.n), $$6x.c(cem.m), $$6x.b(cem.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     ceo $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<bvi> $$14 = $$13.a($$3xxxx -> $$3xxxx.g((bum)$$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new bxm($$5xxxx, true));
                           $$8x.a(new cep(new bxm($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
