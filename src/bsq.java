import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bsq {
   public static <E extends bqt, T> bsm<E> a(Predicate<E> $$0, bzw<? extends T> $$1, bzw<T> $$2, bnq $$3) {
      return bvy.a(
         (Function<bvy.b<E>, ? extends App<bvy.c<E>, bwb<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
