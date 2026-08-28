import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class cai {
   public static <E extends byf> bzx<E> a(Predicate<E> $$0, chh<?> $$1) {
      return cdj.a((Function<cdj.b<E>, ? extends App<cdj.c<E>, cdm<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
