import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnn {
   private static final int a = 200;

   public static <E extends bjk> bla<E> a(BiConsumer<E, bji> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends bjk> bla<E> a(Predicate<bji> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends bjk> bla<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends bjk> bla<E> a(Predicate<bji> $$0, BiConsumer<E, bji> $$1, boolean $$2) {
      return bol.a(
         (Function<bol.b<E>, ? extends App<bol.c<E>, boo<E>>>)($$3 -> $$3.group($$3.b(bsj.o), $$3.a(bsj.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bji $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bv() && $$9.dL() == $$7.dL() && !$$0.test($$9)) {
                     return true;
                  } else {
                     $$1.accept((E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(bji $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dL().V() - $$1.get() > 200L;
   }
}
