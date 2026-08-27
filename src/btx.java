import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class btx {
   public static <E extends bsa, T> btt<E> a(Predicate<E> $$0, cbd<? extends T> $$1, cbd<T> $$2, box $$3) {
      return bxf.a(
         (Function<bxf.b<E>, ? extends App<bxf.c<E>, bxi<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
