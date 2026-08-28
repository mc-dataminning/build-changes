import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvp {
   public static <E extends btk> bve<E> a(Predicate<E> $$0, cco<?> $$1) {
      return byq.a((Function<byq.b<E>, ? extends App<byq.c<E>, byt<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
