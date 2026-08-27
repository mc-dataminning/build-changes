import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bkt {
   public static <E extends biw, T> bkp<E> a(Predicate<E> $$0, bry<? extends T> $$1, bry<T> $$2, bfz $$3) {
      return boa.a(
         (Function<boa.b<E>, ? extends App<boa.c<E>, bod<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
