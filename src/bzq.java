import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzq {
   public static <E extends bxu, T> bzm<E> a(Predicate<E> $$0, cgw<? extends T> $$1, cgw<T> $$2, buc $$3) {
      return ccy.a(
         (Function<ccy.b<E>, ? extends App<ccy.c<E>, cdb<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
