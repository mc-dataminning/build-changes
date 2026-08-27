import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnd {
   public static <E extends bjd> bkt<E> a(Function<E, Optional<? extends bjb>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bjd> bkt<E> a(Predicate<E> $$0, Function<E, Optional<? extends bjb>> $$1) {
      return boe.a(
         (Function<boe.b<E>, ? extends App<boe.c<E>, boh<E>>>)($$2 -> $$2.group($$2.c(bsc.o), $$2.a(bsc.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bjb> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bjb $$8 = $$7.get();
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
