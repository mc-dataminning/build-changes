import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byl {
   public static <E extends bwg> bya<E> a(Predicate<E> $$0, cfk<?> $$1) {
      return cbm.a((Function<cbm.b<E>, ? extends App<cbm.c<E>, cbp<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
