import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bmm {
   public static <E extends bkj> bmb<E> a(Predicate<E> $$0, btk<?> $$1) {
      return bpm.a((Function<bpm.b<E>, ? extends App<bpm.c<E>, bpp<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
