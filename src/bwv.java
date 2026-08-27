import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwv {
   public static <E extends bss> buk<E> a(Function<E, Optional<? extends bsq>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bss> buk<E> a(Predicate<E> $$0, Function<E, Optional<? extends bsq>> $$1) {
      return bxw.a(
         (Function<bxw.b<E>, ? extends App<bxw.c<E>, bxz<E>>>)($$2 -> $$2.group($$2.c(cbu.o), $$2.a(cbu.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bsq> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bsq $$8 = $$7.get();
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
