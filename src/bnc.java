import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnc {
   public static <E extends blg, T> bmy<E> a(Predicate<E> $$0, buh<? extends T> $$1, buh<T> $$2, bii $$3) {
      return bqj.a(
         (Function<bqj.b<E>, ? extends App<bqj.c<E>, bqm<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
