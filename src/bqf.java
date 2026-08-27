import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqf {
   public static <E extends boi, T> bqb<E> a(Predicate<E> $$0, bxl<? extends T> $$1, bxl<T> $$2, blh $$3) {
      return btn.a(
         (Function<btn.b<E>, ? extends App<btn.c<E>, btq<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
