import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnr {
   public static <E extends blv, T> bnn<E> a(Predicate<E> $$0, bux<? extends T> $$1, bux<T> $$2, biw $$3) {
      return bqz.a(
         (Function<bqz.b<E>, ? extends App<bqz.c<E>, brc<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
