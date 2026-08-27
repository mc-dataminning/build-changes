import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bon {
   public static <E extends bmk> boc<E> a(Predicate<E> $$0, bvm<?> $$1) {
      return bro.a((Function<bro.b<E>, ? extends App<bro.c<E>, brr<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
