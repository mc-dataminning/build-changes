import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class bqb {
   private static final int a = 200;

   public static <E extends blx> bnn<E> a(BiConsumer<E, blv> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends blx> bnn<E> a(Predicate<blv> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends blx> bnn<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends blx> bnn<E> a(Predicate<blv> $$0, BiConsumer<E, blv> $$1, boolean $$2) {
      return bqz.a(
         (Function<bqz.b<E>, ? extends App<bqz.c<E>, brc<E>>>)($$3 -> $$3.group($$3.b(bux.o), $$3.a(bux.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  blv $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bx() && $$9.dM() == $$7.dM() && !$$0.test($$9)) {
                     return true;
                  } else {
                     $$1.accept((E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(blv $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dM().W() - $$1.get() > 200L;
   }
}
