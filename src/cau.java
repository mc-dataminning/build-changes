import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cau {
   public static <E extends bwt> byj<E> a(cau.b<E> $$0) {
      return a(($$0x, $$1) -> true, $$0);
   }

   public static <E extends bwt> byj<E> a(cau.a<E> $$0, cau.b<E> $$1) {
      return cbv.a(
         (Function<cbv.b<E>, ? extends App<cbv.c<E>, cby<E>>>)($$2 -> $$2.group($$2.c(cft.p), $$2.a(cft.F)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test($$4, (E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bwr> $$7 = $$1.get($$4, (E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bwr $$8 = $$7.get();
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
      boolean test(arn var1, E var2);
   }

   @FunctionalInterface
   public interface b<E> {
      Optional<? extends bwr> get(arn var1, E var2);
   }
}
