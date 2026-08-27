import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class ble {
   public static <E extends bjb> bkt<E> a(Predicate<E> $$0, bsc<?> $$1) {
      return boe.a((Function<boe.b<E>, ? extends App<boe.c<E>, boh<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
