import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvp {
   public static <E extends btr, T> bvl<E> a(Predicate<E> $$0, ccv<? extends T> $$1, ccv<T> $$2, bqh $$3) {
      return byx.a(
         (Function<byx.b<E>, ? extends App<byx.c<E>, bza<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
