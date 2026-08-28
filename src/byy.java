import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byy {
   public static <E extends bxc, T> byu<E> a(Predicate<E> $$0, cge<? extends T> $$1, cge<T> $$2, btm $$3) {
      return ccg.a(
         (Function<ccg.b<E>, ? extends App<ccg.c<E>, ccj<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
