import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbw {
   public static <E extends cpa> bya<E> a(Function<E, Optional<? extends bwg>> $$0) {
      return cbm.a(
         (Function<cbm.b<E>, ? extends App<cbm.c<E>, cbp<E>>>)($$1 -> $$1.group($$1.c(cfk.ay), $$1.c(cfk.o), $$1.a(cfk.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bwg> $$6 = $$0.apply((E)$$4);
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
