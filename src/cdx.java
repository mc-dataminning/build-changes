import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cdx {
   public static bnx<bmf> a(int $$0) {
      return brj.a(
         (Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$1 -> $$1.group($$1.b(bvh.K), $$1.c(bvh.ac), $$1.c(bvh.af), $$1.c(bvh.ae))
               .apply($$1, ($$2, $$3, $$4, $$5) -> ($$4x, $$5x, $$6) -> {
                     cbo $$7 = $$1.b($$2);
                     if (!cds.a($$7.q())) {
                        return false;
                     } else {
                        $$3.a(true, (long)$$0);
                        return true;
                     }
                  }))
      );
   }
}
