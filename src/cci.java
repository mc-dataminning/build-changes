import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cci {
   public static <E extends byh> bzx<E> a(cci.b<E> $$0) {
      return a(($$0x, $$1) -> true, $$0);
   }

   public static <E extends byh> bzx<E> a(cci.a<E> $$0, cci.b<E> $$1) {
      return cdj.a(
         (Function<cdj.b<E>, ? extends App<cdj.c<E>, cdm<E>>>)($$2 -> $$2.group($$2.c(chh.p), $$2.a(chh.F)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test($$4, (E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends byf> $$7 = $$1.get($$4, (E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        byf $$8 = $$7.get();
                        if (!$$5.c($$8)) {
                           return false;
                        } else {
                           $$2x.a($$8);
                           $$3.b();
                           return true;
                        }
                     }
                  }
               }))
      );
   }

   @FunctionalInterface
   public interface a<E> {
      boolean test(asb var1, E var2);
   }

   @FunctionalInterface
   public interface b<E> {
      Optional<? extends byf> get(asb var1, E var2);
   }
}
