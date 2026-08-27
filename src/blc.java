import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class blc {
   public static <E extends biy> bkr<E> a(Predicate<E> $$0, bsa<?> $$1) {
      return boc.a((Function<boc.b<E>, ? extends App<boc.c<E>, bof<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
