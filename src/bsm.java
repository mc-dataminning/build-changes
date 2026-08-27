import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bsm {
   public static <E extends bok> bqb<E> a(Function<E, Optional<? extends boi>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bok> bqb<E> a(Predicate<E> $$0, Function<E, Optional<? extends boi>> $$1) {
      return btn.a(
         (Function<btn.b<E>, ? extends App<btn.c<E>, btq<E>>>)($$2 -> $$2.group($$2.c(bxl.o), $$2.a(bxl.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends boi> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        boi $$8 = $$7.get();
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
