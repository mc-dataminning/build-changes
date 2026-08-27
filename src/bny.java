import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bny {
   public static <E extends blv> bnn<E> a(Predicate<E> $$0, bux<?> $$1) {
      return bqz.a((Function<bqz.b<E>, ? extends App<bqz.c<E>, brc<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
