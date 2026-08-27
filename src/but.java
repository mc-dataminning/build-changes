import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class but {
   public static <E extends bso> bui<E> a(Predicate<E> $$0, cbs<?> $$1) {
      return bxu.a((Function<bxu.b<E>, ? extends App<bxu.c<E>, bxx<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
