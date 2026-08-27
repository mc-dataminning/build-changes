import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class bwh {
   private static final int a = 200;

   public static <E extends bsc> btt<E> a(BiConsumer<E, bsa> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends bsc> btt<E> a(Predicate<bsa> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends bsc> btt<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends bsc> btt<E> a(Predicate<bsa> $$0, BiConsumer<E, bsa> $$1, boolean $$2) {
      return bxf.a(
         (Function<bxf.b<E>, ? extends App<bxf.c<E>, bxi<E>>>)($$3 -> $$3.group($$3.b(cbd.o), $$3.a(cbd.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bsa $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bB() && $$9.dN() == $$7.dN() && !$$0.test($$9)) {
                     return true;
                  } else {
                     $$1.accept((E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(bsa $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dN().Y() - $$1.get() > 200L;
   }
}
