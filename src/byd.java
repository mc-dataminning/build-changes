import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byd {
   public static <E extends bvy> bxs<E> a(Predicate<E> $$0, cfc<?> $$1) {
      return cbe.a((Function<cbe.b<E>, ? extends App<cbe.c<E>, cbh<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
