import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxv {
   public static <E extends bts> bvk<E> a(Function<E, Optional<? extends btq>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bts> bvk<E> a(Predicate<E> $$0, Function<E, Optional<? extends btq>> $$1) {
      return byw.a(
         (Function<byw.b<E>, ? extends App<byw.c<E>, byz<E>>>)($$2 -> $$2.group($$2.c(ccu.o), $$2.a(ccu.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends btq> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        btq $$8 = $$7.get();
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
