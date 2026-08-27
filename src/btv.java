import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class btv {
   private static final int a = 200;

   public static <E extends bpq> brh<E> a(BiConsumer<E, bpo> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends bpq> brh<E> a(Predicate<bpo> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends bpq> brh<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends bpq> brh<E> a(Predicate<bpo> $$0, BiConsumer<E, bpo> $$1, boolean $$2) {
      return but.a(
         (Function<but.b<E>, ? extends App<but.c<E>, buw<E>>>)($$3 -> $$3.group($$3.b(byr.o), $$3.a(byr.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bpo $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bA() && $$9.dM() == $$7.dM() && !$$0.test($$9)) {
                     return true;
                  } else {
                     $$1.accept((E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(bpo $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dM().X() - $$1.get() > 200L;
   }
}
