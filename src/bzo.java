import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzo {
   public static bwz<bvf> a() {
      return cal.a(
         (Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$0 -> $$0.group($$0.b(cej.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bvf $$1xx ? $$1xx : null)
                           .filter(bvf::eF)
                           .filter($$1xx -> $$1xx.aq() != buq.bR || $$2.O().b(dgc.O))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
