import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzc {
   public static <E extends bwz> byr<E> a(Predicate<E> $$0, cgb<?> $$1) {
      return ccd.a((Function<ccd.b<E>, ? extends App<ccd.c<E>, ccg<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
