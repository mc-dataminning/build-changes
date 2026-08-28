import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bya {
   public static bvl<btr> a() {
      return byx.a(
         (Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$0 -> $$0.group($$0.b(ccv.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof btr $$1xx ? $$1xx : null)
                           .filter(btr::eB)
                           .filter($$1xx -> $$1xx.ak() != btc.by || $$2.ab().b(dbw.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
