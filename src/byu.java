import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byu {
   public static <E extends bwr> byj<E> a(Predicate<E> $$0, cft<?> $$1) {
      return cbv.a((Function<cbv.b<E>, ? extends App<cbv.c<E>, cby<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
