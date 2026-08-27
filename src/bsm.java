import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bsm {
   public static bpx<bog> a() {
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$0 -> $$0.group($$0.b(bxh.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof bog $$1xx ? $$1xx : null)
                           .filter(bog::ex)
                           .filter($$1xx -> $$1xx.ai() != bnu.bw || $$2.Z().b(cvj.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
