import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzn {
   public static <E extends bvk> bxc<E> a(bzn.b<E> $$0) {
      return a(($$0x, $$1) -> true, $$0);
   }

   public static <E extends bvk> bxc<E> a(bzn.a<E> $$0, bzn.b<E> $$1) {
      return cao.a(
         (Function<cao.b<E>, ? extends App<cao.c<E>, car<E>>>)($$2 -> $$2.group($$2.c(cem.o), $$2.a(cem.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test($$4, (E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bvi> $$7 = $$1.get($$4, (E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bvi $$8 = $$7.get();
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
      boolean test(ard var1, E var2);
   }

   @FunctionalInterface
   public interface b<E> {
      Optional<? extends bvi> get(ard var1, E var2);
   }
}
