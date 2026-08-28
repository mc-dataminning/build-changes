import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cak {
   private static final float a = 0.3F;

   public static bzk<bwg> a() {
      return cbm.a(
         (Function<cbm.b<bwg>, ? extends App<cbm.c<bwg>, cbp<bwg>>>)($$0 -> $$0.group($$0.a(cfk.m), $$0.a(cfk.n), $$0.b(cfk.e), $$0.b(cfk.h), $$0.c(cfk.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jp $$9 = $$0.b($$3);
                     cfm $$10 = $$0.b($$4);
                     if ($$6.H_().a(100) == 0 && $$6.ah() == $$9.a() && $$9.b().a($$7.du(), 4.0) && $$10.d($$0xxx -> bvr.bD.equals($$0xxx.aq()))) {
                        $$10.a($$1xx -> bvr.bD.equals($$1xx.aq()) && $$1xx.g((bvk)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new byk($$3xx, true));
                           $$1.a(new cfn(new byk($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
