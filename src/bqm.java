import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqm {
   public static <E extends boi> bqb<E> a(Predicate<E> $$0, bxl<?> $$1) {
      return btn.a((Function<btn.b<E>, ? extends App<btn.c<E>, btq<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
