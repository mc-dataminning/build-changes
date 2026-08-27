import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class brl {
   public static <E extends bpo, T> brh<E> a(Predicate<E> $$0, byr<? extends T> $$1, byr<T> $$2, bmn $$3) {
      return but.a(
         (Function<but.b<E>, ? extends App<but.c<E>, buw<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
