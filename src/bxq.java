import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxq {
   private static final float a = 0.3F;

   public static bwq<btl> a() {
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$0 -> $$0.group($$0.a(ccq.m), $$0.a(ccq.n), $$0.b(ccq.e), $$0.b(ccq.h), $$0.c(ccq.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jl $$9 = $$0.b($$3);
                     ccs $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.af() == $$9.a() && $$9.b().a($$7.do(), 4.0) && $$10.d($$0xxx -> bsw.bj.equals($$0xxx.am()))) {
                        $$10.a($$1xx -> bsw.bj.equals($$1xx.am()) && $$1xx.g((bsq)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bvq($$3xx, true));
                           $$1.a(new cct(new bvq($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
