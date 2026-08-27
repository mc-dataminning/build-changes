import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bum {
   public static <E extends bso, T> bui<E> a(Predicate<E> $$0, cbs<? extends T> $$1, cbs<T> $$2, bpf $$3) {
      return bxu.a(
         (Function<bxu.b<E>, ? extends App<bxu.c<E>, bxx<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
