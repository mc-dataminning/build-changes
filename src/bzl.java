import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzl {
   public static <E extends bvi> bxa<E> a(bzl.b<E> $$0) {
      return a(($$0x, $$1) -> true, $$0);
   }

   public static <E extends bvi> bxa<E> a(bzl.a<E> $$0, bzl.b<E> $$1) {
      return cam.a(
         (Function<cam.b<E>, ? extends App<cam.c<E>, cap<E>>>)($$2 -> $$2.group($$2.c(cek.o), $$2.a(cek.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test($$4, (E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bvg> $$7 = $$1.get($$4, (E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bvg $$8 = $$7.get();
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
      Optional<? extends bvg> get(arc var1, E var2);
   }
}
