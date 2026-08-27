import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqb {
   public static <E extends bog, T> bpx<E> a(Predicate<E> $$0, bxh<? extends T> $$1, bxh<T> $$2, blf $$3) {
      return btj.a(
         (Function<btj.b<E>, ? extends App<btj.c<E>, btm<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
                  if (!$$0.test((E)$$6)) {
                     return false;
                  } else {
                     $$4x.a($$4.b($$3xx), (long)$$3.a($$5.z));
                     return true;
                  }
               }))
      );
   }
}
