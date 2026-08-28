import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxj {
   public static <E extends bve> bwy<E> a(Predicate<E> $$0, cei<?> $$1) {
      return cak.a((Function<cak.b<E>, ? extends App<cak.c<E>, can<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
