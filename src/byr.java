import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class byr {
   public static <E extends bup> bwg<E> a(Function<E, Optional<? extends bun>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bup> bwg<E> a(Predicate<E> $$0, Function<E, Optional<? extends bun>> $$1) {
      return bzs.a(
         (Function<bzs.b<E>, ? extends App<bzs.c<E>, bzv<E>>>)($$2 -> $$2.group($$2.c(cdq.o), $$2.a(cdq.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bun> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bun $$8 = $$7.get();
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
