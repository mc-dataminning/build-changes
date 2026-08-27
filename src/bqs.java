import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqs {
   public static bod<bml> a() {
      return brp.a(
         (Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$0 -> $$0.group($$0.b(bvn.aa))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bml $$1xx ? $$1xx : null)
                           .filter(bml::ew)
                           .filter($$1xx -> $$1xx.ai() != blz.bv || $$2.Z().b(ctl.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
