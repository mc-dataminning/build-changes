import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class btb {
   public static <E extends bre, T> bsx<E> a(Predicate<E> $$0, cah<? extends T> $$1, cah<T> $$2, bob $$3) {
      return bwj.a(
         (Function<bwj.b<E>, ? extends App<bwj.c<E>, bwm<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
