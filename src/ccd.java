import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccd {
   public static bzo<bxw> a() {
      return cda.a(
         (Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$0 -> $$0.group($$0.b(cgy.ac))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.b($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bxw $$1xx ? $$1xx : null)
                           .filter(bxw::eH)
                           .filter($$1xx -> $$1xx.an() != bxe.bT || $$2.O().c(djv.P))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
