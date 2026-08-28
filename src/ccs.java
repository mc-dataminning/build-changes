import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccs {
   public static <E extends cqf> byw<E> a(Function<E, Optional<? extends bxe>> $$0) {
      return cci.a(
         (Function<cci.b<E>, ? extends App<cci.c<E>, ccl<E>>>)($$1 -> $$1.group($$1.c(cgg.az), $$1.c(cgg.p), $$1.a(cgg.F))
               .apply($$1, ($$1x, $$2, $$3) -> ($$3x, $$4, $$5) -> {
                     Optional<? extends bxe> $$6 = $$0.apply((E)$$4);
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
