import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class brs {
   public static <E extends bpo> brh<E> a(Predicate<E> $$0, byr<?> $$1) {
      return but.a((Function<but.b<E>, ? extends App<but.c<E>, buw<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
