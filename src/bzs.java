import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzs {
   public static <E extends bxw, T> bzo<E> a(Predicate<E> $$0, cgy<? extends T> $$1, cgy<T> $$2, bue $$3) {
      return cda.a(
         (Function<cda.b<E>, ? extends App<cda.c<E>, cdd<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
                  if (!$$0.test((E)$$6)) {
                     return false;
                  } else {
                     $$4x.a($$4.b($$3xx), (long)$$3.a($$5.A));
                     return true;
                  }
               }))
      );
   }
}
