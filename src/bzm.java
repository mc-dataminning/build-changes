import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class bzm {
   private static final int a = 200;

   public static <E extends bvg> bwy<E> a(BiConsumer<E, bve> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends bvg> bwy<E> a(Predicate<bve> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends bvg> bwy<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends bvg> bwy<E> a(Predicate<bve> $$0, BiConsumer<E, bve> $$1, boolean $$2) {
      return cak.a(
         (Function<cak.b<E>, ? extends App<cak.c<E>, can<E>>>)($$3 -> $$3.group($$3.b(cei.o), $$3.a(cei.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bve $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bN() && $$9.dY() == $$7.dY() && !$$0.test($$9)) {
                     return true;
                  } else {
                     $$1.accept((E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(bve $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dY().aa() - $$1.get() > 200L;
   }
}
