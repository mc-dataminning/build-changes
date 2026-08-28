import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxu {
   private static final int a = 200;

   public static <E extends btn> bvg<E> a(BiConsumer<E, btl> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends btn> bvg<E> a(Predicate<btl> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends btn> bvg<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends btn> bvg<E> a(Predicate<btl> $$0, BiConsumer<E, btl> $$1, boolean $$2) {
      return bys.a(
         (Function<bys.b<E>, ? extends App<bys.c<E>, byv<E>>>)($$3 -> $$3.group($$3.b(ccq.o), $$3.a(ccq.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  btl $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bE() && $$9.dQ() == $$7.dQ() && !$$0.test($$9)) {
                     return true;
                  } else {
                     $$1.accept((E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(btl $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dQ().Z() - $$1.get() > 200L;
   }
}
