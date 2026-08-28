import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzh {
   public static <E extends bxe> byw<E> a(Predicate<E> $$0, cgg<?> $$1) {
      return cci.a((Function<cci.b<E>, ? extends App<cci.c<E>, ccl<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
