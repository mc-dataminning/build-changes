import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class bnd {
   private static final int a = 200;

   public static <E extends bja> bkq<E> a(BiConsumer<E, biy> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends bja> bkq<E> a(Predicate<biy> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends bja> bkq<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends bja> bkq<E> a(Predicate<biy> $$0, BiConsumer<E, biy> $$1, boolean $$2) {
      return bob.a(
         (Function<bob.b<E>, ? extends App<bob.c<E>, boe<E>>>)($$3 -> $$3.group($$3.b(brz.o), $$3.a(brz.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  biy $$9 = $$3.b($$4);
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

   private static boolean a(biy $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dK().V() - $$1.get() > 200L;
   }
}
