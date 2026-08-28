import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byn {
   private static final float a = 0.3F;

   public static bxn<buk> a() {
      return bzp.a(
         (Function<bzp.b<buk>, ? extends App<bzp.c<buk>, bzs<buk>>>)($$0 -> $$0.group($$0.a(cdn.m), $$0.a(cdn.n), $$0.b(cdn.e), $$0.b(cdn.h), $$0.c(cdn.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jm $$9 = $$0.b($$3);
                     cdp $$10 = $$0.b($$4);
                     if ($$6.C_().a(100) == 0 && $$6.ag() == $$9.a() && $$9.b().a($$7.dq(), 4.0) && $$10.d($$0xxx -> btv.bj.equals($$0xxx.ao()))) {
                        $$10.a($$1xx -> btv.bj.equals($$1xx.ao()) && $$1xx.g((bto)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bwn($$3xx, true));
                           $$1.a(new cdq(new bwn($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
