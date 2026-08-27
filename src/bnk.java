import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnk {
   public static <E extends bjk> bla<E> a(Function<E, Optional<? extends bji>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bjk> bla<E> a(Predicate<E> $$0, Function<E, Optional<? extends bji>> $$1) {
      return bol.a(
         (Function<bol.b<E>, ? extends App<bol.c<E>, boo<E>>>)($$2 -> $$2.group($$2.c(bsj.o), $$2.a(bsj.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bji> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bji $$8 = $$7.get();
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
