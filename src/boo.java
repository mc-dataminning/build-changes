import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class boo {
   public static <E extends cat> bkt<E> a(Function<E, Optional<? extends bjb>> $$0) {
      return boe.a(
         (Function<boe.b<E>, ? extends App<boe.c<E>, boh<E>>>)($$1 -> $$1.group($$1.c(bsc.ax), $$1.c(bsc.o), $$1.a(bsc.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bjb> $$6 = $$0.apply((E)$$4);
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
