import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bku {
   public static <E extends biy, T> bkq<E> a(Predicate<E> $$0, brz<? extends T> $$1, brz<T> $$2, bgb $$3) {
      return bob.a(
         (Function<bob.b<E>, ? extends App<bob.c<E>, boe<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
