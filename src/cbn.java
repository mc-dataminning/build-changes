import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbn {
   public static <E extends cor> bxr<E> a(Function<E, Optional<? extends bvx>> $$0) {
      return cbd.a(
         (Function<cbd.b<E>, ? extends App<cbd.c<E>, cbg<E>>>)($$1 -> $$1.group($$1.c(cfb.ay), $$1.c(cfb.o), $$1.a(cfb.E))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bvx> $$6 = $$0.apply((E)$$4);
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
