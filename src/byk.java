import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class byk {
   public static <E extends bwf> bxz<E> a(Predicate<E> $$0, cfj<?> $$1) {
      return cbl.a((Function<cbl.b<E>, ? extends App<cbl.c<E>, cbo<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
