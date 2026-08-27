import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class bpq {
   private static final int a = 200;

   public static <E extends bln> bnd<E> a(BiConsumer<E, bll> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends bln> bnd<E> a(Predicate<bll> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends bln> bnd<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends bln> bnd<E> a(Predicate<bll> $$0, BiConsumer<E, bll> $$1, boolean $$2) {
      return bqo.a(
         (Function<bqo.b<E>, ? extends App<bqo.c<E>, bqr<E>>>)($$3 -> $$3.group($$3.b(bum.o), $$3.a(bum.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bll $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bx() && $$9.dN() == $$7.dN() && !$$0.test($$9)) {
                     return true;
                  } else {
                     $$1.accept((E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(bll $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dN().W() - $$1.get() > 200L;
   }
}
