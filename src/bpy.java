import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpy {
   public static bnx<bmf> a(blt<?> $$0, int $$1) {
      int $$2 = $$1 * $$1;
      return brj.a(
         (Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$2x -> $$2x.group($$2x.a(bvh.n), $$2x.c(bvh.q), $$2x.b(bvh.h))
               .apply($$2x, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     Optional<bmf> $$9 = $$2x.<bvj>b($$5).a($$3xx -> $$3xx.f((blp)$$7) <= (double)$$2 && $$0.equals($$3xx.ai()));
                     if ($$9.isEmpty()) {
                        return false;
                     } else {
                        bmf $$10 = $$9.get();
                        $$4.a($$10);
                        $$3.a(new boh($$10, true));
                        return true;
                     }
                  }))
      );
   }
}
