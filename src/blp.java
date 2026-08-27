import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class blp {
   public static <E extends bjm> ble<E> a(Predicate<E> $$0, bsn<?> $$1) {
      return bop.a((Function<bop.b<E>, ? extends App<bop.c<E>, bos<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
