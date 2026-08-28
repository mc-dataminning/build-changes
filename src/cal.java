import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cal {
   public static <E extends bwi> bya<E> a(cal.b<E> $$0) {
      return a(($$0x, $$1) -> true, $$0);
   }

   public static <E extends bwi> bya<E> a(cal.a<E> $$0, cal.b<E> $$1) {
      return cbm.a(
         (Function<cbm.b<E>, ? extends App<cbm.c<E>, cbp<E>>>)($$2 -> $$2.group($$2.c(cfk.o), $$2.a(cfk.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test($$4, (E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bwg> $$7 = $$1.get($$4, (E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bwg $$8 = $$7.get();
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
      Optional<? extends bwg> get(ash var1, E var2);
   }
}
