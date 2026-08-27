import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bts {
   public static <E extends bpq> brh<E> a(Function<E, Optional<? extends bpo>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bpq> brh<E> a(Predicate<E> $$0, Function<E, Optional<? extends bpo>> $$1) {
      return but.a(
         (Function<but.b<E>, ? extends App<but.c<E>, buw<E>>>)($$2 -> $$2.group($$2.c(byr.o), $$2.a(byr.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bpo> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bpo $$8 = $$7.get();
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
