import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzj {
   public static <E extends bvg> bwy<E> a(Function<E, Optional<? extends bve>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bvg> bwy<E> a(Predicate<E> $$0, Function<E, Optional<? extends bve>> $$1) {
      return cak.a(
         (Function<cak.b<E>, ? extends App<cak.c<E>, can<E>>>)($$2 -> $$2.group($$2.c(cei.o), $$2.a(cei.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bve> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bve $$8 = $$7.get();
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
