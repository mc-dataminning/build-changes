import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bol {
   public static <E extends bkl> bmb<E> a(Function<E, Optional<? extends bkj>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bkl> bmb<E> a(Predicate<E> $$0, Function<E, Optional<? extends bkj>> $$1) {
      return bpm.a(
         (Function<bpm.b<E>, ? extends App<bpm.c<E>, bpp<E>>>)($$2 -> $$2.group($$2.c(btk.o), $$2.a(btk.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bkj> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bkj $$8 = $$7.get();
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
