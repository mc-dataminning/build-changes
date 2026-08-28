import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cac {
   public static <E extends bvz> bxr<E> a(cac.b<E> $$0) {
      return a(($$0x, $$1) -> true, $$0);
   }

   public static <E extends bvz> bxr<E> a(cac.a<E> $$0, cac.b<E> $$1) {
      return cbd.a(
         (Function<cbd.b<E>, ? extends App<cbd.c<E>, cbg<E>>>)($$2 -> $$2.group($$2.c(cfb.o), $$2.a(cfb.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test($$4, (E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bvx> $$7 = $$1.get($$4, (E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bvx $$8 = $$7.get();
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
      boolean test(arx var1, E var2);
   }

   @FunctionalInterface
   public interface b<E> {
      Optional<? extends bvx> get(arx var1, E var2);
   }
}
