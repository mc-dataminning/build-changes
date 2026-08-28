import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvd {
   public static <E extends bsy> bus<E> a(Predicate<E> $$0, ccc<?> $$1) {
      return bye.a((Function<bye.b<E>, ? extends App<bye.c<E>, byh<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
