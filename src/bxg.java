import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxg {
   public static <E extends btd> buv<E> a(Function<E, Optional<? extends btb>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends btd> buv<E> a(Predicate<E> $$0, Function<E, Optional<? extends btb>> $$1) {
      return byh.a(
         (Function<byh.b<E>, ? extends App<byh.c<E>, byk<E>>>)($$2 -> $$2.group($$2.c(ccf.o), $$2.a(ccf.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends btb> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        btb $$8 = $$7.get();
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
