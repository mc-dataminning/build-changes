import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bss {
   public static <E extends bqo> bsh<E> a(Predicate<E> $$0, bzr<?> $$1) {
      return bvt.a((Function<bvt.b<E>, ? extends App<bvt.c<E>, bvw<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
