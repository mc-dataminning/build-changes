import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bus {
   public static <E extends bqq> bsh<E> a(Function<E, Optional<? extends bqo>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bqq> bsh<E> a(Predicate<E> $$0, Function<E, Optional<? extends bqo>> $$1) {
      return bvt.a(
         (Function<bvt.b<E>, ? extends App<bvt.c<E>, bvw<E>>>)($$2 -> $$2.group($$2.c(bzr.o), $$2.a(bzr.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bqo> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bqo $$8 = $$7.get();
                        if (!$$5.c($$8)) {
                           return false;
                        } else {
                           $$2x.a($$8);
                           $$3.b();
                           return true;
                        }
                     }
                  }
               }))
      );
   }
}
