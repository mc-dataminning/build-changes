import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bys {
   public static <E extends clp> buw<E> a(Function<E, Optional<? extends btc>> $$0) {
      return byi.a(
         (Function<byi.b<E>, ? extends App<byi.c<E>, byl<E>>>)($$1 -> $$1.group($$1.c(ccg.ay), $$1.c(ccg.o), $$1.a(ccg.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends btc> $$6 = $$0.apply((E)$$4);
                     if ($$6.filter($$4::b).isEmpty()) {
                        return false;
                     } else {
                        $$1x.a($$6.get());
                        $$3.b();
                        return true;
                     }
                  }))
      );
   }
}
