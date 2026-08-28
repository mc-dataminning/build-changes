import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbm {
   public static <E extends bxl> bzb<E> a(cbm.b<E> $$0) {
      return a(($$0x, $$1) -> true, $$0);
   }

   public static <E extends bxl> bzb<E> a(cbm.a<E> $$0, cbm.b<E> $$1) {
      return ccn.a(
         (Function<ccn.b<E>, ? extends App<ccn.c<E>, ccq<E>>>)($$2 -> $$2.group($$2.c(cgl.p), $$2.a(cgl.F)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test($$4, (E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bxj> $$7 = $$1.get($$4, (E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bxj $$8 = $$7.get();
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
      Optional<? extends bxj> get(arq var1, E var2);
   }
}
