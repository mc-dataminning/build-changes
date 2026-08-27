import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bws {
   public static <E extends bsq> buh<E> a(Function<E, Optional<? extends bso>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bsq> buh<E> a(Predicate<E> $$0, Function<E, Optional<? extends bso>> $$1) {
      return bxt.a(
         (Function<bxt.b<E>, ? extends App<bxt.c<E>, bxw<E>>>)($$2 -> $$2.group($$2.c(cbr.o), $$2.a(cbr.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bso> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bso $$8 = $$7.get();
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
