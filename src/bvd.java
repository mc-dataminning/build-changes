import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bvd {
   public static <E extends chw> brh<E> a(Function<E, Optional<? extends bpo>> $$0) {
      return but.a(
         (Function<but.b<E>, ? extends App<but.c<E>, buw<E>>>)($$1 -> $$1.group($$1.c(byr.ay), $$1.c(byr.o), $$1.a(byr.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bpo> $$6 = $$0.apply((E)$$4);
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
