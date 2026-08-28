import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxf {
   public static <E extends bva> bwu<E> a(Predicate<E> $$0, cee<?> $$1) {
      return cag.a((Function<cag.b<E>, ? extends App<cag.c<E>, caj<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
