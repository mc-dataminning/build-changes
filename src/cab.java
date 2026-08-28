import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cab {
   public static <E extends byf, T> bzx<E> a(Predicate<E> $$0, chh<? extends T> $$1, chh<T> $$2, bun $$3) {
      return cdj.a(
         (Function<cdj.b<E>, ? extends App<cdj.c<E>, cdm<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
