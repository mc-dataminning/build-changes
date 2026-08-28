import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxn {
   public static <E extends bvi> bxc<E> a(Predicate<E> $$0, cem<?> $$1) {
      return cao.a((Function<cao.b<E>, ? extends App<cao.c<E>, car<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
