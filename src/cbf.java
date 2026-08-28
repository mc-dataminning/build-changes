import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbf {
   public static <E extends bxe> byu<E> a(cbf.b<E> $$0) {
      return a(($$0x, $$1) -> true, $$0);
   }

   public static <E extends bxe> byu<E> a(cbf.a<E> $$0, cbf.b<E> $$1) {
      return ccg.a(
         (Function<ccg.b<E>, ? extends App<ccg.c<E>, ccj<E>>>)($$2 -> $$2.group($$2.c(cge.p), $$2.a(cge.F)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test($$4, (E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bxc> $$7 = $$1.get($$4, (E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bxc $$8 = $$7.get();
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
      Optional<? extends bxc> get(arq var1, E var2);
   }
}
