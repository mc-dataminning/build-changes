import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzm {
   public static <E extends bvj> bxb<E> a(bzm.b<E> $$0) {
      return a(($$0x, $$1) -> true, $$0);
   }

   public static <E extends bvj> bxb<E> a(bzm.a<E> $$0, bzm.b<E> $$1) {
      return can.a(
         (Function<can.b<E>, ? extends App<can.c<E>, caq<E>>>)($$2 -> $$2.group($$2.c(cel.o), $$2.a(cel.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test($$4, (E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bvh> $$7 = $$1.get($$4, (E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bvh $$8 = $$7.get();
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
      boolean test(arp var1, E var2);
   }

   @FunctionalInterface
   public interface b<E> {
      Optional<? extends bvh> get(arp var1, E var2);
   }
}
