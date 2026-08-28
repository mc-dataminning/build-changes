import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzo {
   private static final int a = 200;

   public static <E extends bvi> bxa<E> a(bzo.b<E> $$0) {
      return a(($$0x, $$1) -> false, $$0, true);
   }

   public static <E extends bvi> bxa<E> a(bzo.a $$0) {
      return a($$0, ($$0x, $$1, $$2) -> {
      }, true);
   }

   public static <E extends bvi> bxa<E> a() {
      return a(($$0, $$1) -> false, ($$0, $$1, $$2) -> {
      }, true);
   }

   public static <E extends bvi> bxa<E> a(bzo.a $$0, bzo.b<E> $$1, boolean $$2) {
      return cam.a(
         (Function<cam.b<E>, ? extends App<cam.c<E>, cap<E>>>)($$3 -> $$3.group($$3.b(cek.o), $$3.a(cek.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bvg $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bL() && $$9.dW() == $$7.dW() && !$$0.test($$6, $$9)) {
                     return true;
                  } else {
                     $$1.accept($$6, (E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(bvg $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dW().ad() - $$1.get() > 200L;
   }

   @FunctionalInterface
   public interface a {
      boolean test(arc var1, bvg var2);
   }

   @FunctionalInterface
   public interface b<E> {
      void accept(arc var1, E var2, bvg var3);
   }
}
