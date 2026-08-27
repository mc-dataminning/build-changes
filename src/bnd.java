import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bnd {
   public static bkp<biw> a() {
      return boa.a(
         (Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$0 -> $$0.group($$0.b(bry.aa))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof biw $$1xx ? $$1xx : null)
                           .filter(biw::eu)
                           .filter($$1xx -> $$1xx.ag() != bik.bt || $$2.X().b(cpg.J))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
