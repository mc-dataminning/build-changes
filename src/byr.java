import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byr {
   public static <E extends clo> buv<E> a(Function<E, Optional<? extends btb>> $$0) {
      return byh.a(
         (Function<byh.b<E>, ? extends App<byh.c<E>, byk<E>>>)($$1 -> $$1.group($$1.c(ccf.ay), $$1.c(ccf.o), $$1.a(ccf.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends btb> $$6 = $$0.apply((E)$$4);
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
