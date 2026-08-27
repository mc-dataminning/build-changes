import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bti {
   public static <E extends bre> bsx<E> a(Predicate<E> $$0, cah<?> $$1) {
      return bwj.a((Function<bwj.b<E>, ? extends App<bwj.c<E>, bwm<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
