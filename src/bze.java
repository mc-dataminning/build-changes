import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bze {
   public static bwp<buv> a() {
      return cab.a(
         (Function<cab.b<buv>, ? extends App<cab.c<buv>, cae<buv>>>)($$0 -> $$0.group($$0.b(cdz.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof buv $$1xx ? $$1xx : null)
                           .filter(buv::eH)
                           .filter($$1xx -> $$1xx.aq() != bug.by || $$2.ac().b(der.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
