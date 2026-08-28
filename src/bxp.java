import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxp {
   public static <E extends btm> bve<E> a(Function<E, Optional<? extends btk>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends btm> bve<E> a(Predicate<E> $$0, Function<E, Optional<? extends btk>> $$1) {
      return byq.a(
         (Function<byq.b<E>, ? extends App<byq.c<E>, byt<E>>>)($$2 -> $$2.group($$2.c(cco.o), $$2.a(cco.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends btk> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        btk $$8 = $$7.get();
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
