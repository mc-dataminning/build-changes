import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bul {
   public static <E extends bso, T> buh<E> a(Predicate<E> $$0, cbr<? extends T> $$1, cbr<T> $$2, bpl $$3) {
      return bxt.a(
         (Function<bxt.b<E>, ? extends App<bxt.c<E>, bxw<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
