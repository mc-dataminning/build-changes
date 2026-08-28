import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvm {
   public static <E extends bto, T> bvi<E> a(Predicate<E> $$0, ccs<? extends T> $$1, ccs<T> $$2, bqe $$3) {
      return byu.a(
         (Function<byu.b<E>, ? extends App<byu.c<E>, byx<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
