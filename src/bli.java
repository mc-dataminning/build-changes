import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bli {
   public static <E extends bjm, T> ble<E> a(Predicate<E> $$0, bsn<? extends T> $$1, bsn<T> $$2, bgp $$3) {
      return bop.a(
         (Function<bop.b<E>, ? extends App<bop.c<E>, bos<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
