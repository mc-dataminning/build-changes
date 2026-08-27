import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bsx {
   public static <E extends bqt> bsm<E> a(Predicate<E> $$0, bzw<?> $$1) {
      return bvy.a((Function<bvy.b<E>, ? extends App<bvy.c<E>, bwb<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
