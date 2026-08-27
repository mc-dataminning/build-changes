import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqi {
   public static <E extends bog> bpx<E> a(Predicate<E> $$0, bxh<?> $$1) {
      return btj.a((Function<btj.b<E>, ? extends App<btj.c<E>, btm<E>>>)($$2 -> $$2.group($$2.b($$1)).apply($$2, $$1xx -> ($$2x, $$3, $$4) -> {
               if ($$0.test((E)$$3)) {
                  $$1xx.b();
                  return true;
               } else {
                  return false;
               }
            })));
   }
}
