import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqq {
   private static final float a = 0.3F;

   public static bpq<bmo> a() {
      return brs.a(
         (Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$0 -> $$0.group($$0.a(bvq.m), $$0.a(bvq.n), $$0.b(bvq.e), $$0.b(bvq.h), $$0.c(bvq.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     ig $$9 = $$0.b($$3);
                     bvs $$10 = $$0.b($$4);
                     if ($$6.F_().a(100) == 0 && $$6.ae() == $$9.a() && $$9.b().a($$7.dj(), 4.0) && $$10.d($$0xxx -> bmc.bh.equals($$0xxx.ai()))) {
                        $$10.a($$1xx -> bmc.bh.equals($$1xx.ai()) && $$1xx.f((blw)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new boq($$3xx, true));
                           $$1.a(new bvt(new boq($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
