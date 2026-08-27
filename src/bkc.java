import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class bkc {
   public static <E extends bgb> bhs<E> a(Function<E, Optional<? extends bfz>> $$0) {
      return a($$0x -> true, $$0);
   }

   public static <E extends bgb> bhs<E> a(Predicate<E> $$0, Function<E, Optional<? extends bfz>> $$1) {
      return bld.a(
         (Function<bld.b<E>, ? extends App<bld.c<E>, blg<E>>>)($$2 -> $$2.group($$2.c(bpb.o), $$2.a(bpb.E)).apply($$2, ($$2x, $$3) -> ($$4, $$5, $$6) -> {
                  if (!$$0.test((E)$$5)) {
                     return false;
                  } else {
                     Optional<? extends bfz> $$7 = $$1.apply((E)$$5);
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        bfz $$8 = $$7.get();
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
