import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqv {
   public static bog<bmo> a() {
      return brs.a(
         (Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$0 -> $$0.group($$0.b(bvq.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bmo $$1xx ? $$1xx : null)
                           .filter(bmo::ew)
                           .filter($$1xx -> $$1xx.ai() != bmc.bw || $$2.Z().b(ctt.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
