import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqn {
   public static <E extends bmm> boc<E> a(Function<E, Optional<? extends bmk>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bmm> boc<E> a(Predicate<E> $$0, Function<E, Optional<? extends bmk>> $$1) {
      return bro.a(
         (Function<bro.b<E>, ? extends App<bro.c<E>, brr<E>>>)($$2 -> $$2.group($$2.c(bvm.o), $$2.a(bvm.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bmk> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bmk $$8 = $$7.get();
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
