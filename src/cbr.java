import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbr {
   public static <E extends cov> bxv<E> a(Function<E, Optional<? extends bwb>> $$0) {
      return cbh.a(
         (Function<cbh.b<E>, ? extends App<cbh.c<E>, cbk<E>>>)($$1 -> $$1.group($$1.c(cff.ay), $$1.c(cff.o), $$1.a(cff.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bwb> $$6 = $$0.apply((E)$$4);
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
