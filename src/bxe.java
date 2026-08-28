import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxe {
   public static <E extends bvg, T> bxa<E> a(Predicate<E> $$0, cek<? extends T> $$1, cek<T> $$2, bru $$3) {
      return cam.a(
         (Function<cam.b<E>, ? extends App<cam.c<E>, cap<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
