import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class bte {
   private static final int a = 200;

   public static <E extends boz> bqq<E> a(BiConsumer<E, box> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends boz> bqq<E> a(Predicate<box> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends boz> bqq<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends boz> bqq<E> a(Predicate<box> $$0, BiConsumer<E, box> $$1, boolean $$2) {
      return buc.a(
         (Function<buc.b<E>, ? extends App<buc.c<E>, buf<E>>>)($$3 -> $$3.group($$3.b(bya.o), $$3.a(bya.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  box $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bx() && $$9.dJ() == $$7.dJ() && !$$0.test($$9)) {
                     return true;
                  } else {
                     $$1.accept((E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(box $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dJ().X() - $$1.get() > 200L;
   }
}
