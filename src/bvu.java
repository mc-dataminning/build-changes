import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvu {
   public static <E extends btp> bvj<E> a(Predicate<E> $$0, cct<?> $$1) {
      return byv.a((Function<byv.b<E>, ? extends App<byv.c<E>, byy<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
