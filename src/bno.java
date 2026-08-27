import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bno {
   public static <E extends bll> bnd<E> a(Predicate<E> $$0, bum<?> $$1) {
      return bqo.a((Function<bqo.b<E>, ? extends App<bqo.c<E>, bqr<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
