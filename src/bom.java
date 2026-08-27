import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bom {
   public static <E extends car> bkr<E> a(Function<E, Optional<? extends biy>> $$0) {
      return boc.a(
         (Function<boc.b<E>, ? extends App<boc.c<E>, bof<E>>>)($$1 -> $$1.group($$1.c(bsa.ax), $$1.c(bsa.o), $$1.a(bsa.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends biy> $$6 = $$0.apply((E)$$4);
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
