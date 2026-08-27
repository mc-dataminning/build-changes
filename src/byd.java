import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byd {
   public static <E extends clc> buh<E> a(Function<E, Optional<? extends bso>> $$0) {
      return bxt.a(
         (Function<bxt.b<E>, ? extends App<bxt.c<E>, bxw<E>>>)($$1 -> $$1.group($$1.c(cbr.ay), $$1.c(cbr.o), $$1.a(cbr.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bso> $$6 = $$0.apply((E)$$4);
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
