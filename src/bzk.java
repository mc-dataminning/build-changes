import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzk {
   public static <E extends bvh> bwz<E> a(bzk.b<E> $$0) {
      return a(($$0x, $$1) -> true, $$0);
   }

   public static <E extends bvh> bwz<E> a(bzk.a<E> $$0, bzk.b<E> $$1) {
      return cal.a(
         (Function<cal.b<E>, ? extends App<cal.c<E>, cao<E>>>)($$2 -> $$2.group($$2.c(cej.o), $$2.a(cej.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test($$4, (E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bvf> $$7 = $$1.get($$4, (E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bvf $$8 = $$7.get();
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

   @FunctionalInterface
   public interface a<E> {
      boolean test(arc var1, E var2);
   }

   @FunctionalInterface
   public interface b<E> {
      Optional<? extends bvf> get(arc var1, E var2);
   }
}
