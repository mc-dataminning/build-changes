import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbo {
   public static <E extends cou> bxs<E> a(Function<E, Optional<? extends bvy>> $$0) {
      return cbe.a(
         (Function<cbe.b<E>, ? extends App<cbe.c<E>, cbh<E>>>)($$1 -> $$1.group($$1.c(cfc.ay), $$1.c(cfc.o), $$1.a(cfc.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bvy> $$6 = $$0.apply((E)$$4);
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
