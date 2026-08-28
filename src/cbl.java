import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cbl {
   public static byw<bxe> a() {
      return cci.a(
         (Function<cci.b<bxe>, ? extends App<cci.c<bxe>, ccl<bxe>>>)($$0 -> $$0.group($$0.b(cgg.ac))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.b($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bxe $$1xx ? $$1xx : null)
                           .filter(bxe::eH)
                           .filter($$1xx -> $$1xx.aq() != bwo.bS || $$2.O().c(diw.P))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
