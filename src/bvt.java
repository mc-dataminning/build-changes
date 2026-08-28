import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvt {
   public static <E extends btn> bvi<E> a(Predicate<E> $$0, ccs<?> $$1) {
      return byu.a((Function<byu.b<E>, ? extends App<byu.c<E>, byx<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
