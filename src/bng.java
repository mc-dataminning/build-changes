import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class bng {
   private static final int a = 200;

   public static <E extends bjd> bkt<E> a(BiConsumer<E, bjb> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends bjd> bkt<E> a(Predicate<bjb> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends bjd> bkt<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends bjd> bkt<E> a(Predicate<bjb> $$0, BiConsumer<E, bjb> $$1, boolean $$2) {
      return boe.a(
         (Function<boe.b<E>, ? extends App<boe.c<E>, boh<E>>>)($$3 -> $$3.group($$3.b(bsc.o), $$3.a(bsc.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bjb $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bv() && $$9.dK() == $$7.dK() && !$$0.test($$9)) {
                     return true;
                  } else {
                     $$1.accept((E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(bjb $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dK().V() - $$1.get() > 200L;
   }
}
