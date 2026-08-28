import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxv {
   public static <E extends bvx, T> bxr<E> a(Predicate<E> $$0, cfb<? extends T> $$1, cfb<T> $$2, bsl $$3) {
      return cbd.a(
         (Function<cbd.b<E>, ? extends App<cbd.c<E>, cbg<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
