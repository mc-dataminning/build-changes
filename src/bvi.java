import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvi {
   public static <E extends btk, T> bve<E> a(Predicate<E> $$0, cco<? extends T> $$1, cco<T> $$2, bqa $$3) {
      return byq.a(
         (Function<byq.b<E>, ? extends App<byq.c<E>, byt<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
