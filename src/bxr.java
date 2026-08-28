import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bxr {
   public static <E extends btn> bvg<E> a(Function<E, Optional<? extends btl>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends btn> bvg<E> a(Predicate<E> $$0, Function<E, Optional<? extends btl>> $$1) {
      return bys.a(
         (Function<bys.b<E>, ? extends App<bys.c<E>, byv<E>>>)($$2 -> $$2.group($$2.c(ccq.o), $$2.a(ccq.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends btl> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        btl $$8 = $$7.get();
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
