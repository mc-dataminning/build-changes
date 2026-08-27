import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bru {
   public static bnx<bmf> a() {
      return brj.a(
         (Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$0 -> $$0.group($$0.a(bvh.n), $$0.a(bvh.ay), $$0.a(bvh.ax), $$0.c(bvh.o))
               .apply($$0, ($$1, $$2, $$3, $$4) -> ($$4x, $$5, $$6) -> {
                     Optional<hx> $$7 = $$0.<bmf>a($$3).map(blp::dm).or(() -> $$0.a($$2));
                     if ($$7.isEmpty()) {
                        return false;
                     } else {
                        $$1.a(new bnz($$7.get()));
                        return true;
                     }
                  }))
      );
   }
}
