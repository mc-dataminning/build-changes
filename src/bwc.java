import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwc {
   public static <E extends buf, T> bvy<E> a(Predicate<E> $$0, cdi<? extends T> $$1, cdi<T> $$2, bqv $$3) {
      return bzk.a(
         (Function<bzk.b<E>, ? extends App<bzk.c<E>, bzn<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
                  if (!$$0.test((E)$$6)) {
                     return false;
                  } else {
                     $$4x.a($$4.b($$3xx), (long)$$3.a($$5.z));
                     return true;
                  }
               }))
      );
   }
}
