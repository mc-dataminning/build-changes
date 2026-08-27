import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bni {
   public static <E extends bji> bky<E> a(Function<E, Optional<? extends bjg>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bji> bky<E> a(Predicate<E> $$0, Function<E, Optional<? extends bjg>> $$1) {
      return boj.a(
         (Function<boj.b<E>, ? extends App<boj.c<E>, bom<E>>>)($$2 -> $$2.group($$2.c(bsh.o), $$2.a(bsh.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bjg> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bjg $$8 = $$7.get();
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
