import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxt {
   public static bve<btk> a() {
      return byq.a(
         (Function<byq.b<btk>, ? extends App<byq.c<btk>, byt<btk>>>)($$0 -> $$0.group($$0.b(cco.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof btk $$1xx ? $$1xx : null)
                           .filter(btk::eB)
                           .filter($$1xx -> $$1xx.ak() != bsv.by || $$2.ab().b(dbp.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
