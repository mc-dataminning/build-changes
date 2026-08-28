import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byq {
   private static final float a = 0.3F;

   public static bxq<bun> a() {
      return bzs.a(
         (Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$0 -> $$0.group($$0.a(cdq.m), $$0.a(cdq.n), $$0.b(cdq.e), $$0.b(cdq.h), $$0.c(cdq.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jn $$9 = $$0.b($$3);
                     cds $$10 = $$0.b($$4);
                     if ($$6.D_().a(100) == 0 && $$6.ag() == $$9.a() && $$9.b().a($$7.dq(), 4.0) && $$10.d($$0xxx -> bty.bj.equals($$0xxx.ao()))) {
                        $$10.a($$1xx -> bty.bj.equals($$1xx.ao()) && $$1xx.g((btr)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bwq($$3xx, true));
                           $$1.a(new cdt(new bwq($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
