import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brb {
   private static final int a = 36;

   public static bnx<bmf> a() {
      return brj.a(
         (Function<brj.b<bmf>, ? extends App<brj.c<bmf>, brm<bmf>>>)($$0 -> $$0.group($$0.a(bvh.x), $$0.a(bvh.y), $$0.a(bvh.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bmf>a($$2).filter($$1xx -> $$1xx.f((blp)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dO().a($$4.Y(), $$4.X());
                     }

                     return true;
                  }))
      );
   }
}
