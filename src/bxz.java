import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxz {
   public static <E extends bwb, T> bxv<E> a(Predicate<E> $$0, cff<? extends T> $$1, cff<T> $$2, bsp $$3) {
      return cbh.a(
         (Function<cbh.b<E>, ? extends App<cbh.c<E>, cbk<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
