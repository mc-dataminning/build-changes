import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bop {
   public static bmb<bkj> a() {
      return bpm.a(
         (Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$0 -> $$0.group($$0.b(btk.aa))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bkj $$1xx ? $$1xx : null)
                           .filter(bkj::ev)
                           .filter($$1xx -> $$1xx.ag() != bjx.bt || $$2.X().b(cqv.K))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
