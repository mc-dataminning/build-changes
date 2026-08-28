import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bva {
   public static <E extends btc, T> buw<E> a(Predicate<E> $$0, ccg<? extends T> $$1, ccg<T> $$2, bps $$3) {
      return byi.a(
         (Function<byi.b<E>, ? extends App<byi.c<E>, byl<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
