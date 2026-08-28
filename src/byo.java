import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byo {
   public static <E extends cll> bus<E> a(Function<E, Optional<? extends bsy>> $$0) {
      return bye.a(
         (Function<bye.b<E>, ? extends App<bye.c<E>, byh<E>>>)($$1 -> $$1.group($$1.c(ccc.ay), $$1.c(ccc.o), $$1.a(ccc.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bsy> $$6 = $$0.apply((E)$$4);
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
