import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxy {
   private static final int a = 200;

   public static <E extends bts> bvk<E> a(BiConsumer<E, btq> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends bts> bvk<E> a(Predicate<btq> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends bts> bvk<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends bts> bvk<E> a(Predicate<btq> $$0, BiConsumer<E, btq> $$1, boolean $$2) {
      return byw.a(
         (Function<byw.b<E>, ? extends App<byw.c<E>, byz<E>>>)($$3 -> $$3.group($$3.b(ccu.o), $$3.a(ccu.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  btq $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bD() && $$9.dP() == $$7.dP() && !$$0.test($$9)) {
                     return true;
                  } else {
                     $$1.accept((E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(btq $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dP().Z() - $$1.get() > 200L;
   }
}
