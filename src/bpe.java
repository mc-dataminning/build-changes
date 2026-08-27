import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpe {
   public static bmq<bky> a() {
      return bqb.a(
         (Function<bqb.b<bky>, ? extends App<bqb.c<bky>, bqe<bky>>>)($$0 -> $$0.group($$0.b(btz.aa))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bky $$1xx ? $$1xx : null)
                           .filter(bky::ev)
                           .filter($$1xx -> $$1xx.ag() != bkm.bt || $$2.X().b(cro.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
