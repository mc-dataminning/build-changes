import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbp {
   private static final int a = 200;

   public static <E extends bxl> bzb<E> a(cbp.b<E> $$0) {
      return a(($$0x, $$1) -> false, $$0, true);
   }

   public static <E extends bxl> bzb<E> a(cbp.a $$0) {
      return a($$0, ($$0x, $$1, $$2) -> {
      }, true);
   }

   public static <E extends bxl> bzb<E> a() {
      return a(($$0, $$1) -> false, ($$0, $$1, $$2) -> {
      }, true);
   }

   public static <E extends bxl> bzb<E> a(cbp.a $$0, cbp.b<E> $$1, boolean $$2) {
      return ccn.a(
         (Function<ccn.b<E>, ? extends App<ccn.c<E>, ccq<E>>>)($$3 -> $$3.group($$3.b(cgl.p), $$3.a(cgl.F)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bxj $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bI() && $$9.dU() == $$7.dU() && !$$0.test($$6, $$9)) {
                     return true;
                  } else {
                     $$1.accept($$6, (E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(bxj $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dU().ae() - $$1.get() > 200L;
   }

   @FunctionalInterface
   public interface a {
      boolean test(arq var1, bxj var2);
   }

   @FunctionalInterface
   public interface b<E> {
      void accept(arq var1, E var2, bxj var3);
   }
}
