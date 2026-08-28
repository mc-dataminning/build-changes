import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxt {
   public static <E extends btp> bvi<E> a(Function<E, Optional<? extends btn>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends btp> bvi<E> a(Predicate<E> $$0, Function<E, Optional<? extends btn>> $$1) {
      return byu.a(
         (Function<byu.b<E>, ? extends App<byu.c<E>, byx<E>>>)($$2 -> $$2.group($$2.c(ccs.o), $$2.a(ccs.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends btn> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        btn $$8 = $$7.get();
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
