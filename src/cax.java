import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cax {
   public static <E extends cnw> bxb<E> a(Function<E, Optional<? extends bvh>> $$0) {
      return can.a(
         (Function<can.b<E>, ? extends App<can.c<E>, caq<E>>>)($$1 -> $$1.group($$1.c(cel.ay), $$1.c(cel.o), $$1.a(cel.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bvh> $$6 = $$0.apply((E)$$4);
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
