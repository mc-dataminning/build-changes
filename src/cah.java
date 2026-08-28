import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cah {
   public static bxs<bvy> a() {
      return cbe.a(
         (Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$0 -> $$0.group($$0.b(cfc.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.b($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bvy $$1xx ? $$1xx : null)
                           .filter(bvy::eF)
                           .filter($$1xx -> $$1xx.aq() != bvi.bR || $$2.O().b(dgv.O))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
