import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvw {
   public static <E extends btr> bvl<E> a(Predicate<E> $$0, ccv<?> $$1) {
      return byx.a((Function<byx.b<E>, ? extends App<byx.c<E>, bza<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
