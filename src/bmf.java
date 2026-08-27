import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bmf {
   public static <E extends bkj, T> bmb<E> a(Predicate<E> $$0, btk<? extends T> $$1, btk<T> $$2, bhm $$3) {
      return bpm.a(
         (Function<bpm.b<E>, ? extends App<bpm.c<E>, bpp<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
