import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzl {
   private static final float a = 0.3F;

   public static byl<bvh> a() {
      return can.a(
         (Function<can.b<bvh>, ? extends App<can.c<bvh>, caq<bvh>>>)($$0 -> $$0.group($$0.a(cel.m), $$0.a(cel.n), $$0.b(cel.e), $$0.b(cel.h), $$0.c(cel.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jq $$9 = $$0.b($$3);
                     cen $$10 = $$0.b($$4);
                     if ($$6.H_().a(100) == 0 && $$6.ai() == $$9.a() && $$9.b().a($$7.dt(), 4.0) && $$10.d($$0xxx -> bus.bC.equals($$0xxx.aq()))) {
                        $$10.a($$1xx -> bus.bC.equals($$1xx.aq()) && $$1xx.g((bul)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bxl($$3xx, true));
                           $$1.a(new ceo(new bxl($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
