import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class caf {
   private static final int a = 200;

   public static <E extends bvz> bxr<E> a(caf.b<E> $$0) {
      return a(($$0x, $$1) -> false, $$0, true);
   }

   public static <E extends bvz> bxr<E> a(caf.a $$0) {
      return a($$0, ($$0x, $$1, $$2) -> {
      }, true);
   }

   public static <E extends bvz> bxr<E> a() {
      return a(($$0, $$1) -> false, ($$0, $$1, $$2) -> {
      }, true);
   }

   public static <E extends bvz> bxr<E> a(caf.a $$0, caf.b<E> $$1, boolean $$2) {
      return cbd.a(
         (Function<cbd.b<E>, ? extends App<cbd.c<E>, cbg<E>>>)($$3 -> $$3.group($$3.b(cfb.o), $$3.a(cfb.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bvx $$9 = $$3.b($$4);
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

   private static boolean a(bvx $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dW().ad() - $$1.get() > 200L;
   }

   @FunctionalInterface
   public interface a {
      boolean test(arx var1, bvx var2);
   }

   @FunctionalInterface
   public interface b<E> {
      void accept(arx var1, E var2, bvx var3);
   }
}
