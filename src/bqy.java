import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqy {
   public static <E extends cdd> bnd<E> a(Function<E, Optional<? extends bll>> $$0) {
      return bqo.a(
         (Function<bqo.b<E>, ? extends App<bqo.c<E>, bqr<E>>>)($$1 -> $$1.group($$1.c(bum.ax), $$1.c(bum.o), $$1.a(bum.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bll> $$6 = $$0.apply((E)$$4);
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
