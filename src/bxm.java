import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxm {
   public static <E extends bvh> bxb<E> a(Predicate<E> $$0, cel<?> $$1) {
      return can.a((Function<can.b<E>, ? extends App<can.c<E>, caq<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
