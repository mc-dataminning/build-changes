import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvr {
   public static <E extends btl> bvg<E> a(Predicate<E> $$0, ccq<?> $$1) {
      return bys.a((Function<bys.b<E>, ? extends App<bys.c<E>, byv<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
