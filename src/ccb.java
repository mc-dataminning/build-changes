import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccb {
   public static bzm<bxu> a() {
      return ccy.a(
         (Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$0 -> $$0.group($$0.b(cgw.ac))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.b($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bxu $$1xx ? $$1xx : null)
                           .filter(bxu::eH)
                           .filter($$1xx -> $$1xx.an() != bxc.bT || $$2.O().c(djt.P))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
