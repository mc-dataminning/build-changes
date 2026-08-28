import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzf {
   public static <E extends bxj, T> bzb<E> a(Predicate<E> $$0, cgl<? extends T> $$1, cgl<T> $$2, btr $$3) {
      return ccn.a(
         (Function<ccn.b<E>, ? extends App<ccn.c<E>, ccq<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
