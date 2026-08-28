import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccf {
   public static <E extends cpl> byj<E> a(Function<E, Optional<? extends bwr>> $$0) {
      return cbv.a(
         (Function<cbv.b<E>, ? extends App<cbv.c<E>, cby<E>>>)($$1 -> $$1.group($$1.c(cft.az), $$1.c(cft.p), $$1.a(cft.F))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bwr> $$6 = $$0.apply((E)$$4);
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
