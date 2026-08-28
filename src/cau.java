import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cau {
   public static <E extends cnt> bwy<E> a(Function<E, Optional<? extends bve>> $$0) {
      return cak.a(
         (Function<cak.b<E>, ? extends App<cak.c<E>, can<E>>>)($$1 -> $$1.group($$1.c(cei.ay), $$1.c(cei.o), $$1.a(cei.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bve> $$6 = $$0.apply((E)$$4);
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
