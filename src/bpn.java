import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bpn {
   public static <E extends bln> bnd<E> a(Function<E, Optional<? extends bll>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bln> bnd<E> a(Predicate<E> $$0, Function<E, Optional<? extends bll>> $$1) {
      return bqo.a(
         (Function<bqo.b<E>, ? extends App<bqo.c<E>, bqr<E>>>)($$2 -> $$2.group($$2.c(bum.o), $$2.a(bum.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bll> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bll $$8 = $$7.get();
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
