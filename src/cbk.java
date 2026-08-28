import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbk {
   private static final int a = 200;

   public static <E extends bxg> byw<E> a(cbk.b<E> $$0) {
      return a(($$0x, $$1) -> false, $$0, true);
   }

   public static <E extends bxg> byw<E> a(cbk.a $$0) {
      return a($$0, ($$0x, $$1, $$2) -> {
      }, true);
   }

   public static <E extends bxg> byw<E> a() {
      return a(($$0, $$1) -> false, ($$0, $$1, $$2) -> {
      }, true);
   }

   public static <E extends bxg> byw<E> a(cbk.a $$0, cbk.b<E> $$1, boolean $$2) {
      return cci.a(
         (Function<cci.b<E>, ? extends App<cci.c<E>, ccl<E>>>)($$3 -> $$3.group($$3.b(cgg.p), $$3.a(cgg.F)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bxe $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bK() && $$9.dV() == $$7.dV() && !$$0.test($$6, $$9)) {
                     return true;
                  } else {
                     $$1.accept($$6, (E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(bxe $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dV().ae() - $$1.get() > 200L;
   }

   @FunctionalInterface
   public interface a {
      boolean test(arq var1, bxe var2);
   }

   @FunctionalInterface
   public interface b<E> {
      void accept(arq var1, E var2, bxe var3);
   }
}
