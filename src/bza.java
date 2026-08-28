import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bza {
   public static <E extends bxe, T> byw<E> a(Predicate<E> $$0, cgg<? extends T> $$1, cgg<T> $$2, bto $$3) {
      return cci.a(
         (Function<cci.b<E>, ? extends App<cci.c<E>, ccl<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
