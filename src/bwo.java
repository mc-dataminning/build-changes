import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwo {
   public static <E extends buk> bwd<E> a(Predicate<E> $$0, cdn<?> $$1) {
      return bzp.a((Function<bzp.b<E>, ? extends App<bzp.c<E>, bzs<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
