import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnj {
   public static <E extends blg> bmy<E> a(Predicate<E> $$0, buh<?> $$1) {
      return bqj.a((Function<bqj.b<E>, ? extends App<bqj.c<E>, bqm<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
