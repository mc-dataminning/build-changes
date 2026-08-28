import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class byj {
   public static <E extends buh> bvy<E> a(Function<E, Optional<? extends buf>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends buh> bvy<E> a(Predicate<E> $$0, Function<E, Optional<? extends buf>> $$1) {
      return bzk.a(
         (Function<bzk.b<E>, ? extends App<bzk.c<E>, bzn<E>>>)($$2 -> $$2.group($$2.c(cdi.o), $$2.a(cdi.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends buf> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        buf $$8 = $$7.get();
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
