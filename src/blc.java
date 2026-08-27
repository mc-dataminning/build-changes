import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class blc {
   public static <E extends bjg, T> bky<E> a(Predicate<E> $$0, bsh<? extends T> $$1, bsh<T> $$2, bgj $$3) {
      return boj.a(
         (Function<boj.b<E>, ? extends App<boj.c<E>, bom<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
