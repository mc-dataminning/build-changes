import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnb {
   public static <E extends bja> bkr<E> a(Function<E, Optional<? extends biy>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bja> bkr<E> a(Predicate<E> $$0, Function<E, Optional<? extends biy>> $$1) {
      return boc.a(
         (Function<boc.b<E>, ? extends App<boc.c<E>, bof<E>>>)($$2 -> $$2.group($$2.c(bsa.o), $$2.a(bsa.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends biy> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        biy $$8 = $$7.get();
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
