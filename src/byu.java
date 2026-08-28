import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class byu {
   private static final int a = 200;

   public static <E extends bup> bwg<E> a(BiConsumer<E, bun> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends bup> bwg<E> a(Predicate<bun> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends bup> bwg<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends bup> bwg<E> a(Predicate<bun> $$0, BiConsumer<E, bun> $$1, boolean $$2) {
      return bzs.a(
         (Function<bzs.b<E>, ? extends App<bzs.c<E>, bzv<E>>>)($$3 -> $$3.group($$3.b(cdq.o), $$3.a(cdq.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bun $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bI() && $$9.dS() == $$7.dS() && !$$0.test($$9)) {
                     return true;
                  } else {
                     $$1.accept((E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(bun $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dS().aa() - $$1.get() > 200L;
   }
}
