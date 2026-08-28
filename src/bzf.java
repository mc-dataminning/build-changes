import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzf {
   public static <E extends bxc> byu<E> a(Predicate<E> $$0, cge<?> $$1) {
      return ccg.a((Function<ccg.b<E>, ? extends App<ccg.c<E>, ccj<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
