import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccx {
   public static <E extends cqm> bzb<E> a(Function<E, Optional<? extends bxj>> $$0) {
      return ccn.a(
         (Function<ccn.b<E>, ? extends App<ccn.c<E>, ccq<E>>>)($$1 -> $$1.group($$1.c(cgl.az), $$1.c(cgl.p), $$1.a(cgl.F))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bxj> $$6 = $$0.apply((E)$$4);
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
