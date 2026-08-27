import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class brb {
   public static <E extends box> bqq<E> a(Predicate<E> $$0, bya<?> $$1) {
      return buc.a((Function<buc.b<E>, ? extends App<buc.c<E>, buf<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
