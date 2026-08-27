import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class boo {
   private static final int a = 200;

   public static <E extends bkl> bmb<E> a(BiConsumer<E, bkj> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends bkl> bmb<E> a(Predicate<bkj> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends bkl> bmb<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends bkl> bmb<E> a(Predicate<bkj> $$0, BiConsumer<E, bkj> $$1, boolean $$2) {
      return bpm.a(
         (Function<bpm.b<E>, ? extends App<bpm.c<E>, bpp<E>>>)($$3 -> $$3.group($$3.b(btk.o), $$3.a(btk.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bkj $$9 = $$3.b($$4);
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

   private static boolean a(bkj $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dL().V() - $$1.get() > 200L;
   }
}
