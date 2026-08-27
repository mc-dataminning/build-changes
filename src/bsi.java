import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bsi {
   public static <E extends boi> bpx<E> a(Function<E, Optional<? extends bog>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends boi> bpx<E> a(Predicate<E> $$0, Function<E, Optional<? extends bog>> $$1) {
      return btj.a(
         (Function<btj.b<E>, ? extends App<btj.c<E>, btm<E>>>)($$2 -> $$2.group($$2.c(bxh.o), $$2.a(bxh.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bog> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bog $$8 = $$7.get();
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
}
