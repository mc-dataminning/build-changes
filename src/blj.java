import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class blj {
   public static <E extends bjg> bky<E> a(Predicate<E> $$0, bsh<?> $$1) {
      return boj.a((Function<boj.b<E>, ? extends App<boj.c<E>, bom<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
