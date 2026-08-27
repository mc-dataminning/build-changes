import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class btt {
   public static <E extends bpr> bri<E> a(Function<E, Optional<? extends bpp>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bpr> bri<E> a(Predicate<E> $$0, Function<E, Optional<? extends bpp>> $$1) {
      return buu.a(
         (Function<buu.b<E>, ? extends App<buu.c<E>, bux<E>>>)($$2 -> $$2.group($$2.c(bys.o), $$2.a(bys.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bpp> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bpp $$8 = $$7.get();
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
