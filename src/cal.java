import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cal {
   public static <E extends cnk> bwp<E> a(Function<E, Optional<? extends buv>> $$0) {
      return cab.a(
         (Function<cab.b<E>, ? extends App<cab.c<E>, cae<E>>>)($$1 -> $$1.group($$1.c(cdz.ay), $$1.c(cdz.o), $$1.a(cdz.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends buv> $$6 = $$0.apply((E)$$4);
                     if ($$6.filter($$4::c).isEmpty()) {
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
