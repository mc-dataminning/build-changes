import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class brm {
   public static <E extends bpp, T> bri<E> a(Predicate<E> $$0, bys<? extends T> $$1, bys<T> $$2, bmo $$3) {
      return buu.a(
         (Function<buu.b<E>, ? extends App<buu.c<E>, bux<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
