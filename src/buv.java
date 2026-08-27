import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class buv {
   public static <E extends bsq> buk<E> a(Predicate<E> $$0, cbu<?> $$1) {
      return bxw.a((Function<bxw.b<E>, ? extends App<bxw.c<E>, bxz<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
