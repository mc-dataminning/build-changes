import com.mojang.datafixers.kinds.App;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqu {
   public static <E extends box, T> bqq<E> a(Predicate<E> $$0, bya<? extends T> $$1, bya<T> $$2, blw $$3) {
      return buc.a(
         (Function<buc.b<E>, ? extends App<buc.c<E>, buf<E>>>)($$4 -> $$4.group($$4.b($$1), $$4.c($$2)).apply($$4, ($$3xx, $$4x) -> ($$5, $$6, $$7) -> {
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
