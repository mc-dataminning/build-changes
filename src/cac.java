import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cac {
   public static <E extends cnb> bwg<E> a(Function<E, Optional<? extends bun>> $$0) {
      return bzs.a(
         (Function<bzs.b<E>, ? extends App<bzs.c<E>, bzv<E>>>)($$1 -> $$1.group($$1.c(cdq.ay), $$1.c(cdq.o), $$1.a(cdq.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bun> $$6 = $$0.apply((E)$$4);
                     if ($$6.filter($$4::c).isEmpty()) {
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
