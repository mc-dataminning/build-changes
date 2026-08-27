import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class boz {
   public static <E extends cbe> ble<E> a(Function<E, Optional<? extends bjm>> $$0) {
      return bop.a(
         (Function<bop.b<E>, ? extends App<bop.c<E>, bos<E>>>)($$1 -> $$1.group($$1.c(bsn.ax), $$1.c(bsn.o), $$1.a(bsn.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bjm> $$6 = $$0.apply((E)$$4);
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
