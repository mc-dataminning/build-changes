import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvg {
   public static <E extends btb> buv<E> a(Predicate<E> $$0, ccf<?> $$1) {
      return byh.a((Function<byh.b<E>, ? extends App<byh.c<E>, byk<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
