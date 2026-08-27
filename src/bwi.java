import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwi {
   public static btt<bsa> a() {
      return bxf.a(
         (Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$0 -> $$0.group($$0.b(cbd.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bsa $$1xx ? $$1xx : null)
                           .filter(bsa::ez)
                           .filter($$1xx -> $$1xx.ai() != brn.bx || $$2.aa().b(czz.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
