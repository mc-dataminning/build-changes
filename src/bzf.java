import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzf {
   public static <E extends bvc> bwu<E> a(Function<E, Optional<? extends bva>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bvc> bwu<E> a(Predicate<E> $$0, Function<E, Optional<? extends bva>> $$1) {
      return cag.a(
         (Function<cag.b<E>, ? extends App<cag.c<E>, caj<E>>>)($$2 -> $$2.group($$2.c(cee.o), $$2.a(cee.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bva> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bva $$8 = $$7.get();
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
