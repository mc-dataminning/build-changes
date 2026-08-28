import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bxz {
   public static bvk<btq> a() {
      return byw.a(
         (Function<byw.b<btq>, ? extends App<byw.c<btq>, byz<btq>>>)($$0 -> $$0.group($$0.b(ccu.ab))
               .apply(
                  $$0,
                  $$1 -> ($$2, $$3, $$4) -> {
                        Optional.ofNullable($$2.a($$0.b($$1)))
                           .map($$0xxx -> $$0xxx instanceof btq $$1xx ? $$1xx : null)
                           .filter(btq::eB)
                           .filter($$1xx -> $$1xx.ak() != btb.by || $$2.ab().b(dbv.N))
                           .ifPresent($$1xx -> $$1.b());
                        return true;
                     }
               ))
      );
   }
}
