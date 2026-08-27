import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqc {
   public static bnn<blv> a() {
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$0 -> $$0.group($$0.b(bux.aa))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof blv $$1xx ? $$1xx : null)
                           .filter(blv::ew)
                           .filter($$1xx -> $$1xx.ai() != blj.bv || $$2.Y().b(csu.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
