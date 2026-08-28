import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvk {
   public static <E extends btl, T> bvg<E> a(Predicate<E> $$0, ccq<? extends T> $$1, ccq<T> $$2, bqb $$3) {
      return bys.a(
         (Function<bys.b<E>, ? extends App<bys.c<E>, byv<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
