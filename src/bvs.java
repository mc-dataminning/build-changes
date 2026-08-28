import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvs {
   public static <E extends btn> bvh<E> a(Predicate<E> $$0, ccr<?> $$1) {
      return byt.a((Function<byt.b<E>, ? extends App<byt.c<E>, byw<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
