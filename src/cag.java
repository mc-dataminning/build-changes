import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cag {
   public static <E extends bwd> bxv<E> a(cag.b<E> $$0) {
      return a(($$0x, $$1) -> true, $$0);
   }

   public static <E extends bwd> bxv<E> a(cag.a<E> $$0, cag.b<E> $$1) {
      return cbh.a(
         (Function<cbh.b<E>, ? extends App<cbh.c<E>, cbk<E>>>)($$2 -> $$2.group($$2.c(cff.o), $$2.a(cff.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test($$4, (E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bwb> $$7 = $$1.get($$4, (E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bwb $$8 = $$7.get();
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
      Optional<? extends bwb> get(ash var1, E var2);
   }
}
