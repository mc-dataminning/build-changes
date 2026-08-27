import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class brj {
   public static <E extends cdv> bnn<E> a(Function<E, Optional<? extends blv>> $$0) {
      return bqz.a(
         (Function<bqz.b<E>, ? extends App<bqz.c<E>, brc<E>>>)($$1 -> $$1.group($$1.c(bux.ax), $$1.c(bux.o), $$1.a(bux.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends blv> $$6 = $$0.apply((E)$$4);
                     if ($$6.filter($$4::a).isEmpty()) {
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
