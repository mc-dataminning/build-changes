import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwd {
   public static <E extends cix> bsh<E> a(Function<E, Optional<? extends bqo>> $$0) {
      return bvt.a(
         (Function<bvt.b<E>, ? extends App<bvt.c<E>, bvw<E>>>)($$1 -> $$1.group($$1.c(bzr.ay), $$1.c(bzr.o), $$1.a(bzr.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bqo> $$6 = $$0.apply((E)$$4);
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
