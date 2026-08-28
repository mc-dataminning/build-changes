import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvo {
   public static <E extends btq, T> bvk<E> a(Predicate<E> $$0, ccu<? extends T> $$1, ccu<T> $$2, bqg $$3) {
      return byw.a(
         (Function<byw.b<E>, ? extends App<byw.c<E>, byz<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
