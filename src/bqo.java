import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqo {
   public static <E extends bmn> bod<E> a(Function<E, Optional<? extends bml>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bmn> bod<E> a(Predicate<E> $$0, Function<E, Optional<? extends bml>> $$1) {
      return brp.a(
         (Function<brp.b<E>, ? extends App<brp.c<E>, brs<E>>>)($$2 -> $$2.group($$2.c(bvn.o), $$2.a(bvn.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bml> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bml $$8 = $$7.get();
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
