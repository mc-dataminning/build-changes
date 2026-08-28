import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzg {
   public static <E extends cmc> bvk<E> a(Function<E, Optional<? extends btq>> $$0) {
      return byw.a(
         (Function<byw.b<E>, ? extends App<byw.c<E>, byz<E>>>)($$1 -> $$1.group($$1.c(ccu.ay), $$1.c(ccu.o), $$1.a(ccu.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends btq> $$6 = $$0.apply((E)$$4);
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
