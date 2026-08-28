import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvl {
   public static <E extends btn, T> bvh<E> a(Predicate<E> $$0, ccr<? extends T> $$1, ccr<T> $$2, bqd $$3) {
      return byt.a(
         (Function<byt.b<E>, ? extends App<byt.c<E>, byw<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
