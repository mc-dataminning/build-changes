import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bkx {
   public static <E extends bjb, T> bkt<E> a(Predicate<E> $$0, bsc<? extends T> $$1, bsc<T> $$2, bge $$3) {
      return boe.a(
         (Function<boe.b<E>, ? extends App<boe.c<E>, boh<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
