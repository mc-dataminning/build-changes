import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbx {
   public static <E extends bxw> bzm<E> a(cbx.b<E> $$0) {
      return a(($$0x, $$1) -> true, $$0);
   }

   public static <E extends bxw> bzm<E> a(cbx.a<E> $$0, cbx.b<E> $$1) {
      return ccy.a(
         (Function<ccy.b<E>, ? extends App<ccy.c<E>, cdb<E>>>)($$2 -> $$2.group($$2.c(cgw.p), $$2.a(cgw.F)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test($$4, (E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bxu> $$7 = $$1.get($$4, (E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bxu $$8 = $$7.get();
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
      boolean test(ars var1, E var2);
   }

   @FunctionalInterface
   public interface b<E> {
      Optional<? extends bxu> get(ars var1, E var2);
   }
}
