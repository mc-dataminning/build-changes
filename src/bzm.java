import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzm {
   public static <E extends bxj> bzb<E> a(Predicate<E> $$0, cgl<?> $$1) {
      return ccn.a((Function<ccn.b<E>, ? extends App<ccn.c<E>, ccq<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
