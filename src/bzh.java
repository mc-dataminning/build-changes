import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzh {
   public static <E extends cmd> bvl<E> a(Function<E, Optional<? extends btr>> $$0) {
      return byx.a(
         (Function<byx.b<E>, ? extends App<byx.c<E>, bza<E>>>)($$1 -> $$1.group($$1.c(ccv.ay), $$1.c(ccv.o), $$1.a(ccv.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends btr> $$6 = $$0.apply((E)$$4);
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
