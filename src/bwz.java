import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwz {
   public static buk<bsq> a() {
      return bxw.a(
         (Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$0 -> $$0.group($$0.b(cbu.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bsq $$1xx ? $$1xx : null)
                           .filter(bsq::eB)
                           .filter($$1xx -> $$1xx.ak() != bsc.by || $$2.aa().b(dav.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
