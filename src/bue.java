import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bue {
   public static <E extends bsa> btt<E> a(Predicate<E> $$0, cbd<?> $$1) {
      return bxf.a((Function<bxf.b<E>, ? extends App<bxf.c<E>, bxi<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
