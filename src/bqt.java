import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqt {
   public static <E extends ccy> bmy<E> a(Function<E, Optional<? extends blg>> $$0) {
      return bqj.a(
         (Function<bqj.b<E>, ? extends App<bqj.c<E>, bqm<E>>>)($$1 -> $$1.group($$1.c(buh.ax), $$1.c(buh.o), $$1.a(buh.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends blg> $$6 = $$0.apply((E)$$4);
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
