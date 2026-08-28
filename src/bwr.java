import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwr {
   public static <E extends bun> bwg<E> a(Predicate<E> $$0, cdq<?> $$1) {
      return bzs.a((Function<bzs.b<E>, ? extends App<bzs.c<E>, bzv<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
