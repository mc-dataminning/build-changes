import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cca {
   private static final int a = 200;

   public static <E extends bxw> bzm<E> a(cca.b<E> $$0) {
      return a(($$0x, $$1) -> false, $$0, true);
   }

   public static <E extends bxw> bzm<E> a(cca.a $$0) {
      return a($$0, ($$0x, $$1, $$2) -> {
      }, true);
   }

   public static <E extends bxw> bzm<E> a() {
      return a(($$0, $$1) -> false, ($$0, $$1, $$2) -> {
      }, true);
   }

   public static <E extends bxw> bzm<E> a(cca.a $$0, cca.b<E> $$1, boolean $$2) {
      return ccy.a(
         (Function<ccy.b<E>, ? extends App<ccy.c<E>, cdb<E>>>)($$3 -> $$3.group($$3.b(cgw.p), $$3.a(cgw.F)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bxu $$9 = $$3.b($$4);
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

   private static boolean a(bxu $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dV().ae() - $$1.get() > 200L;
   }

   @FunctionalInterface
   public interface a {
      boolean test(ars var1, bxu var2);
   }

   @FunctionalInterface
   public interface b<E> {
      void accept(ars var1, E var2, bxu var3);
   }
}
