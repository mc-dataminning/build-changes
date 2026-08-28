import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccl {
   private static final int a = 200;

   public static <E extends byh> bzx<E> a(ccl.b<E> $$0) {
      return a(($$0x, $$1) -> false, $$0, true);
   }

   public static <E extends byh> bzx<E> a(ccl.a $$0) {
      return a($$0, ($$0x, $$1, $$2) -> {
      }, true);
   }

   public static <E extends byh> bzx<E> a() {
      return a(($$0, $$1) -> false, ($$0, $$1, $$2) -> {
      }, true);
   }

   public static <E extends byh> bzx<E> a(ccl.a $$0, ccl.b<E> $$1, boolean $$2) {
      return cdj.a(
         (Function<cdj.b<E>, ? extends App<cdj.c<E>, cdm<E>>>)($$3 -> $$3.group($$3.b(chh.p), $$3.a(chh.F)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  byf $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bJ() && $$9.dV() == $$7.dV() && !$$0.test($$6, $$9)) {
                     return true;
                  } else {
                     $$1.accept($$6, (E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(byf $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dV().ae() - $$1.get() > 200L;
   }

   @FunctionalInterface
   public interface a {
      boolean test(asb var1, byf var2);
   }

   @FunctionalInterface
   public interface b<E> {
      void accept(asb var1, E var2, byf var3);
   }
}
