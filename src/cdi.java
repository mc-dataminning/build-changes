import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cdi {
   public static <E extends cra> bzm<E> a(Function<E, Optional<? extends bxu>> $$0) {
      return ccy.a(
         (Function<ccy.b<E>, ? extends App<ccy.c<E>, cdb<E>>>)($$1 -> $$1.group($$1.c(cgw.az), $$1.c(cgw.p), $$1.a(cgw.F))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bxu> $$6 = $$0.apply((E)$$4);
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
