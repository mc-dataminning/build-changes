import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxk {
   private static final int a = 200;

   public static <E extends bte> buw<E> a(BiConsumer<E, btc> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends bte> buw<E> a(Predicate<btc> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends bte> buw<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends bte> buw<E> a(Predicate<btc> $$0, BiConsumer<E, btc> $$1, boolean $$2) {
      return byi.a(
         (Function<byi.b<E>, ? extends App<byi.c<E>, byl<E>>>)($$3 -> $$3.group($$3.b(ccg.o), $$3.a(ccg.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  btc $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bF() && $$9.dR() == $$7.dR() && !$$0.test($$9)) {
                     return true;
                  } else {
                     $$1.accept((E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(btc $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dR().Z() - $$1.get() > 200L;
   }
}
