import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cag {
   private static final int a = 200;

   public static <E extends bwa> bxs<E> a(cag.b<E> $$0) {
      return a(($$0x, $$1) -> false, $$0, true);
   }

   public static <E extends bwa> bxs<E> a(cag.a $$0) {
      return a($$0, ($$0x, $$1, $$2) -> {
      }, true);
   }

   public static <E extends bwa> bxs<E> a() {
      return a(($$0, $$1) -> false, ($$0, $$1, $$2) -> {
      }, true);
   }

   public static <E extends bwa> bxs<E> a(cag.a $$0, cag.b<E> $$1, boolean $$2) {
      return cbe.a(
         (Function<cbe.b<E>, ? extends App<cbe.c<E>, cbh<E>>>)($$3 -> $$3.group($$3.b(cfc.o), $$3.a(cfc.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bvy $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bJ() && $$9.dU() == $$7.dU() && !$$0.test($$6, $$9)) {
                     return true;
                  } else {
                     $$1.accept($$6, (E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(bvy $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dU().ae() - $$1.get() > 200L;
   }

   @FunctionalInterface
   public interface a {
      boolean test(ard var1, bvy var2);
   }

   @FunctionalInterface
   public interface b<E> {
      void accept(ard var1, E var2, bvy var3);
   }
}
