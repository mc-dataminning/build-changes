import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class buv {
   private static final int a = 200;

   public static <E extends bqq> bsh<E> a(BiConsumer<E, bqo> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends bqq> bsh<E> a(Predicate<bqo> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends bqq> bsh<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends bqq> bsh<E> a(Predicate<bqo> $$0, BiConsumer<E, bqo> $$1, boolean $$2) {
      return bvt.a(
         (Function<bvt.b<E>, ? extends App<bvt.c<E>, bvw<E>>>)($$3 -> $$3.group($$3.b(bzr.o), $$3.a(bzr.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bqo $$9 = $$3.b($$4);
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

   private static boolean a(bqo $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dM().Y() - $$1.get() > 200L;
   }
}
