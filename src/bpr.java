import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpr {
   public static bnd<bll> a() {
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$0 -> $$0.group($$0.b(bum.aa))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bll $$1xx ? $$1xx : null)
                           .filter(bll::ex)
                           .filter($$1xx -> $$1xx.ai() != bkz.bt || $$2.Y().b(csb.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
