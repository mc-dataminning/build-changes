import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class btb {
   public static <E extends boz> bqq<E> a(Function<E, Optional<? extends box>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends boz> bqq<E> a(Predicate<E> $$0, Function<E, Optional<? extends box>> $$1) {
      return buc.a(
         (Function<buc.b<E>, ? extends App<buc.c<E>, buf<E>>>)($$2 -> $$2.group($$2.c(bya.o), $$2.a(bya.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends box> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        box $$8 = $$7.get();
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
