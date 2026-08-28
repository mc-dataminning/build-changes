import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzz {
   public static <E extends bxw> bzo<E> a(Predicate<E> $$0, cgy<?> $$1) {
      return cda.a((Function<cda.b<E>, ? extends App<cda.c<E>, cdd<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
