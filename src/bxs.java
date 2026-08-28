import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxs {
   private static final float a = 0.3F;

   public static bws<bto> a() {
      return byu.a(
         (Function<byu.b<bto>, ? extends App<byu.c<bto>, byx<bto>>>)($$0 -> $$0.group($$0.a(ccs.m), $$0.a(ccs.n), $$0.b(ccs.e), $$0.b(ccs.h), $$0.c(ccs.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jh $$9 = $$0.b($$3);
                     ccu $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.af() == $$9.a() && $$9.b().a($$7.dn(), 4.0) && $$10.d($$0xxx -> bsz.bj.equals($$0xxx.ak()))) {
                        $$10.a($$1xx -> bsz.bj.equals($$1xx.ak()) && $$1xx.g((bst)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bvs($$3xx, true));
                           $$1.a(new ccv(new bvs($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
