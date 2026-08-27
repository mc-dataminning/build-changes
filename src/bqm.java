import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bqm {
   public static bnx<bmf> a() {
      return brj.a(
         (Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$0 -> $$0.group($$0.b(bvh.aa))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bmf $$1xx ? $$1xx : null)
                           .filter(bmf::ew)
                           .filter($$1xx -> $$1xx.ai() != blt.bv || $$2.Z().b(cte.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
