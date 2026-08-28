import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzk {
   private static final float a = 0.3F;

   public static byk<bvg> a() {
      return cam.a(
         (Function<cam.b<bvg>, ? extends App<cam.c<bvg>, cap<bvg>>>)($$0 -> $$0.group($$0.a(cek.m), $$0.a(cek.n), $$0.b(cek.e), $$0.b(cek.h), $$0.c(cek.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jq $$9 = $$0.b($$3);
                     cem $$10 = $$0.b($$4);
                     if ($$6.H_().a(100) == 0 && $$6.ai() == $$9.a() && $$9.b().a($$7.du(), 4.0) && $$10.d($$0xxx -> bur.bD.equals($$0xxx.aq()))) {
                        $$10.a($$1xx -> bur.bD.equals($$1xx.aq()) && $$1xx.g((buk)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bxk($$3xx, true));
                           $$1.a(new cen(new bxk($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
