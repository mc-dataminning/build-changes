import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzd {
   private static final int a = 200;

   public static <E extends bux> bwp<E> a(BiConsumer<E, buv> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends bux> bwp<E> a(Predicate<buv> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends bux> bwp<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends bux> bwp<E> a(Predicate<buv> $$0, BiConsumer<E, buv> $$1, boolean $$2) {
      return cab.a(
         (Function<cab.b<E>, ? extends App<cab.c<E>, cae<E>>>)($$3 -> $$3.group($$3.b(cdz.o), $$3.a(cdz.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  buv $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bM() && $$9.dX() == $$7.dX() && !$$0.test($$9)) {
                     return true;
                  } else {
                     $$1.accept((E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(buv $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dX().aa() - $$1.get() > 200L;
   }
}
