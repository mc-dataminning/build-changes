import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bux {
   public static <E extends bqv> bsm<E> a(Function<E, Optional<? extends bqt>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bqv> bsm<E> a(Predicate<E> $$0, Function<E, Optional<? extends bqt>> $$1) {
      return bvy.a(
         (Function<bvy.b<E>, ? extends App<bvy.c<E>, bwb<E>>>)($$2 -> $$2.group($$2.c(bzw.o), $$2.a(bzw.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bqt> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bqt $$8 = $$7.get();
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
