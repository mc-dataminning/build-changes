import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bok {
   public static <E extends bmo, T> bog<E> a(Predicate<E> $$0, bvq<? extends T> $$1, bvq<T> $$2, bjn $$3) {
      return brs.a(
         (Function<brs.b<E>, ? extends App<brs.c<E>, brv<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
