import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvl {
   private static final int a = 36;

   public static bsh<bqo> a() {
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$0 -> $$0.group($$0.a(bzr.x), $$0.a(bzr.y), $$0.a(bzr.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<bqo>a($$2).filter($$1xx -> $$1xx.g((bpv)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dP().a($$4.Z(), $$4.Y());
                     }

                     return true;
                  }))
      );
   }
}
