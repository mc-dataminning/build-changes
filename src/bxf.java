import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxf {
   public static <E extends bvh, T> bxb<E> a(Predicate<E> $$0, cel<? extends T> $$1, cel<T> $$2, brv $$3) {
      return can.a(
         (Function<can.b<E>, ? extends App<can.c<E>, caq<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
