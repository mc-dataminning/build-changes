import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class bkf {
   private static final int a = 200;

   public static <E extends bgb> bhs<E> a(BiConsumer<E, bfz> $$0) {
      return a($$0x -> false, $$0, true);
   }

   public static <E extends bgb> bhs<E> a(Predicate<bfz> $$0) {
      return a($$0, ($$0x, $$1) -> {
      }, true);
   }

   public static <E extends bgb> bhs<E> a() {
      return a($$0 -> false, ($$0, $$1) -> {
      }, true);
   }

   public static <E extends bgb> bhs<E> a(Predicate<bfz> $$0, BiConsumer<E, bfz> $$1, boolean $$2) {
      return bld.a(
         (Function<bld.b<E>, ? extends App<bld.c<E>, blg<E>>>)($$3 -> $$3.group($$3.b(bpb.o), $$3.a(bpb.E)).apply($$3, ($$4, $$5) -> ($$6, $$7, $$8) -> {
                  bfz $$9 = $$3.b($$4);
                  if ($$7.c($$9) && (!$$2 || !a($$7, $$3.a($$5))) && $$9.bs() && $$9.dI() == $$7.dI() && !$$0.test($$9)) {
                     return true;
                  } else {
                     $$1.accept((E)$$7, $$9);
                     $$4.b();
                     return true;
                  }
               }))
      );
   }

   private static boolean a(bfz $$0, Optional<Long> $$1) {
      return $$1.isPresent() && $$0.dI().V() - $$1.get() > 200L;
   }
}
