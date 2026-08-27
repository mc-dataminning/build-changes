import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class brt {
   public static <E extends bpp> bri<E> a(Predicate<E> $$0, bys<?> $$1) {
      return buu.a((Function<buu.b<E>, ? extends App<buu.c<E>, bux<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
