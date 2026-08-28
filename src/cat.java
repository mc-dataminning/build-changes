import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class cat {
   public static <T extends byf> bzx<byf> a(bxn<? extends T> $$0, int $$1, chh<T> $$2, float $$3, int $$4) {
      return a($$0, $$1, $$0x -> true, $$0x -> true, $$2, $$3, $$4);
   }

   public static <E extends byf, T extends byf> bzx<E> a(bxn<? extends T> $$0, int $$1, Predicate<E> $$2, Predicate<T> $$3, chh<T> $$4, float $$5, int $$6) {
      int $$7 = $$1 * $$1;
      Predicate<byf> $$8 = $$2x -> $$0.equals($$2x.an()) && $$3.test((T)$$2x);
      return cdj.a(
         (Function<cdj.b<E>, ? extends App<cdj.c<E>, cdm<E>>>)($$6x -> $$6x.group($$6x.a($$4), $$6x.a(chh.o), $$6x.c(chh.n), $$6x.b(chh.h))
               .apply($$6x, ($$6xx, $$7x, $$8x, $$9) -> ($$10, $$11, $$12) -> {
                     chj $$13 = $$6x.b($$9);
                     if ($$2.test((E)$$11) && $$13.d($$8)) {
                        Optional<byf> $$14 = $$13.a($$3xxxx -> $$3xxxx.g($$11) <= (double)$$7 && $$8.test($$3xxxx));
                        $$14.ifPresent($$5xxxx -> {
                           $$6xx.a($$5xxxx);
                           $$7x.a(new cah($$5xxxx, true));
                           $$8x.a(new chk(new cah($$5xxxx, false), $$5, $$6));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
