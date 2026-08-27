import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bor {
   public static <E extends bmo> bog<E> a(Predicate<E> $$0, bvq<?> $$1) {
      return brs.a((Function<brs.b<E>, ? extends App<brs.c<E>, brv<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
