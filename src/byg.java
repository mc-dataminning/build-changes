import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byg {
   public static <E extends bwb> bxv<E> a(Predicate<E> $$0, cff<?> $$1) {
      return cbh.a((Function<cbh.b<E>, ? extends App<cbh.c<E>, cbk<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
