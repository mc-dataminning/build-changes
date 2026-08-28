import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cak {
   public static <E extends bwh> bxz<E> a(cak.b<E> $$0) {
      return a(($$0x, $$1) -> true, $$0);
   }

   public static <E extends bwh> bxz<E> a(cak.a<E> $$0, cak.b<E> $$1) {
      return cbl.a(
         (Function<cbl.b<E>, ? extends App<cbl.c<E>, cbo<E>>>)($$2 -> $$2.group($$2.c(cfj.o), $$2.a(cfj.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test($$4, (E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bwf> $$7 = $$1.get($$4, (E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bwf $$8 = $$7.get();
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
      boolean test(ash var1, E var2);
   }

   @FunctionalInterface
   public interface b<E> {
      Optional<? extends bwf> get(ash var1, E var2);
   }
}
