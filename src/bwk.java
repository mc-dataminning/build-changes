import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwk {
   public static <E extends bun, T> bwg<E> a(Predicate<E> $$0, cdq<? extends T> $$1, cdq<T> $$2, brd $$3) {
      return bzs.a(
         (Function<bzs.b<E>, ? extends App<bzs.c<E>, bzv<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
