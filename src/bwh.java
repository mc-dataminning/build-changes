import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwh {
   public static <E extends buk, T> bwd<E> a(Predicate<E> $$0, cdn<? extends T> $$1, cdn<T> $$2, bra $$3) {
      return bzp.a(
         (Function<bzp.b<E>, ? extends App<bzp.c<E>, bzs<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
