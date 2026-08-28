import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxl {
   public static <E extends bvg> bxa<E> a(Predicate<E> $$0, cek<?> $$1) {
      return cam.a((Function<cam.b<E>, ? extends App<cam.c<E>, cap<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
