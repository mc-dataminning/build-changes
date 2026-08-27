import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqr {
   public static <E extends bmq> bog<E> a(Function<E, Optional<? extends bmo>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bmq> bog<E> a(Predicate<E> $$0, Function<E, Optional<? extends bmo>> $$1) {
      return brs.a(
         (Function<brs.b<E>, ? extends App<brs.c<E>, brv<E>>>)($$2 -> $$2.group($$2.c(bvq.o), $$2.a(bvq.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bmo> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bmo $$8 = $$7.get();
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
