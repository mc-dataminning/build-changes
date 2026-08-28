import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byc {
   public static <E extends bvx> bxr<E> a(Predicate<E> $$0, cfb<?> $$1) {
      return cbd.a((Function<cbd.b<E>, ? extends App<cbd.c<E>, cbg<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
