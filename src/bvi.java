import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bvi {
   public static <E extends brg> bsx<E> a(Function<E, Optional<? extends bre>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends brg> bsx<E> a(Predicate<E> $$0, Function<E, Optional<? extends bre>> $$1) {
      return bwj.a(
         (Function<bwj.b<E>, ? extends App<bwj.c<E>, bwm<E>>>)($$2 -> $$2.group($$2.c(cah.o), $$2.a(cah.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bre> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bre $$8 = $$7.get();
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
