import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bve {
   public static <E extends chy> bri<E> a(Function<E, Optional<? extends bpp>> $$0) {
      return buu.a(
         (Function<buu.b<E>, ? extends App<buu.c<E>, bux<E>>>)($$1 -> $$1.group($$1.c(bys.ay), $$1.c(bys.o), $$1.a(bys.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bpp> $$6 = $$0.apply((E)$$4);
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
