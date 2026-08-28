import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbh {
   public static <E extends bxg> byw<E> a(cbh.b<E> $$0) {
      return a(($$0x, $$1) -> true, $$0);
   }

   public static <E extends bxg> byw<E> a(cbh.a<E> $$0, cbh.b<E> $$1) {
      return cci.a(
         (Function<cci.b<E>, ? extends App<cci.c<E>, ccl<E>>>)($$2 -> $$2.group($$2.c(cgg.p), $$2.a(cgg.F)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test($$4, (E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bxe> $$7 = $$1.get($$4, (E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bxe $$8 = $$7.get();
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
      boolean test(arq var1, E var2);
   }

   @FunctionalInterface
   public interface b<E> {
      Optional<? extends bxe> get(arq var1, E var2);
   }
}
