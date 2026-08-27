import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bid {
   public static <E extends bfz> bhs<E> a(Predicate<E> $$0, bpb<?> $$1) {
      return bld.a((Function<bld.b<E>, ? extends App<bld.c<E>, blg<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
