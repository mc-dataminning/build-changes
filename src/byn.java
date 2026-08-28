import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byn {
   public static bvy<buf> a() {
      return bzk.a(
         (Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$0 -> $$0.group($$0.b(cdi.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof buf $$1xx ? $$1xx : null)
                           .filter(buf::eB)
                           .filter($$1xx -> $$1xx.ao() != btq.by || $$2.ac().b(ddo.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
