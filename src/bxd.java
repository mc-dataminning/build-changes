import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxd {
   public static <E extends bta> bus<E> a(Function<E, Optional<? extends bsy>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bta> bus<E> a(Predicate<E> $$0, Function<E, Optional<? extends bsy>> $$1) {
      return bye.a(
         (Function<bye.b<E>, ? extends App<bye.c<E>, byh<E>>>)($$2 -> $$2.group($$2.c(ccc.o), $$2.a(ccc.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bsy> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bsy $$8 = $$7.get();
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
