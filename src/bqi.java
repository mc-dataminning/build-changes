import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqi {
   public static <E extends bmh> bnx<E> a(Function<E, Optional<? extends bmf>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bmh> bnx<E> a(Predicate<E> $$0, Function<E, Optional<? extends bmf>> $$1) {
      return brj.a(
         (Function<brj.b<E>, ? extends App<brj.c<E>, brm<E>>>)($$2 -> $$2.group($$2.c(bvh.o), $$2.a(bvh.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bmf> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bmf $$8 = $$7.get();
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
