import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class caf {
   private static final float a = 0.3F;

   public static bzf<bwb> a() {
      return cbh.a(
         (Function<cbh.b<bwb>, ? extends App<cbh.c<bwb>, cbk<bwb>>>)($$0 -> $$0.group($$0.a(cff.m), $$0.a(cff.n), $$0.b(cff.e), $$0.b(cff.h), $$0.c(cff.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jp $$9 = $$0.b($$3);
                     cfh $$10 = $$0.b($$4);
                     if ($$6.H_().a(100) == 0 && $$6.ah() == $$9.a() && $$9.b().a($$7.dt(), 4.0) && $$10.d($$0xxx -> bvm.bD.equals($$0xxx.aq()))) {
                        $$10.a($$1xx -> bvm.bD.equals($$1xx.aq()) && $$1xx.g((bvf)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new byf($$3xx, true));
                           $$1.a(new cfi(new byf($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
