import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bno {
   public static <E extends bjo> ble<E> a(Function<E, Optional<? extends bjm>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bjo> ble<E> a(Predicate<E> $$0, Function<E, Optional<? extends bjm>> $$1) {
      return bop.a(
         (Function<bop.b<E>, ? extends App<bop.c<E>, bos<E>>>)($$2 -> $$2.group($$2.c(bsn.o), $$2.a(bsn.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bjm> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bjm $$8 = $$7.get();
                        if (!$$5.c($$8)) {
                           return false;
                        } else {
                           $$2x.a($$8);
                           $$3.b();
                           return true;
                        }
                     }
                  }
               }))
      );
   }
}
