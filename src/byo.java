import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byo {
   private static final int a = 36;

   public static bvk<btq> a() {
      return byw.a(
         (Function<byw.b<btq>, ? extends App<byw.c<btq>, byz<btq>>>)($$0 -> $$0.group($$0.a(ccu.x), $$0.a(ccu.y), $$0.a(ccu.A))
               .apply($$0, ($$1, $$2, $$3) -> ($$4, $$5, $$6) -> {
                     boolean $$7 = $$0.a($$1).isPresent() || $$0.a($$3).isPresent() || $$0.<btq>a($$2).filter($$1xx -> $$1xx.g((bsv)$$5) <= 36.0).isPresent();
                     if (!$$7) {
                        $$1.b();
                        $$2.b();
                        $$5.dS().a($$4.aa(), $$4.Z());
                     }

                     return true;
                  }))
      );
   }
}
