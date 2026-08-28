import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxc {
   public static <E extends bve, T> bwy<E> a(Predicate<E> $$0, cei<? extends T> $$1, cei<T> $$2, brs $$3) {
      return cak.a(
         (Function<cak.b<E>, ? extends App<cak.c<E>, can<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
