import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvv {
   public static <E extends btq> bvk<E> a(Predicate<E> $$0, ccu<?> $$1) {
      return byw.a((Function<byw.b<E>, ? extends App<byw.c<E>, byz<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
