import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwy {
   public static <E extends bva, T> bwu<E> a(Predicate<E> $$0, cee<? extends T> $$1, cee<T> $$2, bro $$3) {
      return cag.a(
         (Function<cag.b<E>, ? extends App<cag.c<E>, caj<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
