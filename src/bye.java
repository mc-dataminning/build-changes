import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bye {
   public static <E extends bwg, T> bya<E> a(Predicate<E> $$0, cfk<? extends T> $$1, cfk<T> $$2, bsu $$3) {
      return cbm.a(
         (Function<cbm.b<E>, ? extends App<cbm.c<E>, cbp<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
                  if (!$$0.test((E)$$6)) {
                     return false;
                  } else {
                     $$4x.a($$4.b($$3xx), (long)$$3.a($$5.A));
                     return true;
                  }
               }))
      );
   }
}
