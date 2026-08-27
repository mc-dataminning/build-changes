import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bmu {
   public static <E extends bky, T> bmq<E> a(Predicate<E> $$0, btz<? extends T> $$1, btz<T> $$2, bib $$3) {
      return bqb.a(
         (Function<bqb.b<E>, ? extends App<bqb.c<E>, bqe<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
