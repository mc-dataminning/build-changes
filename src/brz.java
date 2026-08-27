import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class brz {
   public static <E extends cem> bod<E> a(Function<E, Optional<? extends bml>> $$0) {
      return brp.a(
         (Function<brp.b<E>, ? extends App<brp.c<E>, brs<E>>>)($$1 -> $$1.group($$1.c(bvn.ax), $$1.c(bvn.o), $$1.a(bvn.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bml> $$6 = $$0.apply((E)$$4);
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
