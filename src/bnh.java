import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnh {
   public static <E extends bll, T> bnd<E> a(Predicate<E> $$0, bum<? extends T> $$1, bum<T> $$2, bim $$3) {
      return bqo.a(
         (Function<bqo.b<E>, ? extends App<bqo.c<E>, bqr<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
