import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bpi {
   public static <E extends bli> bmy<E> a(Function<E, Optional<? extends blg>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bli> bmy<E> a(Predicate<E> $$0, Function<E, Optional<? extends blg>> $$1) {
      return bqj.a(
         (Function<bqj.b<E>, ? extends App<bqj.c<E>, bqm<E>>>)($$2 -> $$2.group($$2.c(buh.o), $$2.a(buh.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends blg> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        blg $$8 = $$7.get();
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
