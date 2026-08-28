import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class caj {
   private static final float a = 0.3F;

   public static bzj<bwf> a() {
      return cbl.a(
         (Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$0 -> $$0.group($$0.a(cfj.m), $$0.a(cfj.n), $$0.b(cfj.e), $$0.b(cfj.h), $$0.c(cfj.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jp $$9 = $$0.b($$3);
                     cfl $$10 = $$0.b($$4);
                     if ($$6.H_().a(100) == 0 && $$6.ah() == $$9.a() && $$9.b().a($$7.dt(), 4.0) && $$10.d($$0xxx -> bvq.bD.equals($$0xxx.aq()))) {
                        $$10.a($$1xx -> bvq.bD.equals($$1xx.aq()) && $$1xx.g((bvj)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new byj($$3xx, true));
                           $$1.a(new cfm(new byj($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
