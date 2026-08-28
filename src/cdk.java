import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cdk {
   public static <E extends crc> bzo<E> a(Function<E, Optional<? extends bxw>> $$0) {
      return cda.a(
         (Function<cda.b<E>, ? extends App<cda.c<E>, cdd<E>>>)($$1 -> $$1.group($$1.c(cgy.az), $$1.c(cgy.p), $$1.a(cgy.F))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bxw> $$6 = $$0.apply((E)$$4);
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
