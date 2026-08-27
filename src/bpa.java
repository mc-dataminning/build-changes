import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bpa {
   public static <E extends bla> bmq<E> a(Function<E, Optional<? extends bky>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bla> bmq<E> a(Predicate<E> $$0, Function<E, Optional<? extends bky>> $$1) {
      return bqb.a(
         (Function<bqb.b<E>, ? extends App<bqb.c<E>, bqe<E>>>)($$2 -> $$2.group($$2.c(btz.o), $$2.a(btz.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bky> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bky $$8 = $$7.get();
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
