import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bob {
   public static <E extends bmf, T> bnx<E> a(Predicate<E> $$0, bvh<? extends T> $$1, bvh<T> $$2, bjg $$3) {
      return brj.a(
         (Function<brj.b<E>, ? extends App<brj.c<E>, brm<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
