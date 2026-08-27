import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class blb {
   public static <E extends biy> bkq<E> a(Predicate<E> $$0, brz<?> $$1) {
      return bob.a((Function<bob.b<E>, ? extends App<bob.c<E>, boe<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
