import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwd {
   private static final float a = 0.3F;

   public static bvd<bsa> a() {
      return bxf.a(
         (Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$0 -> $$0.group($$0.a(cbd.m), $$0.a(cbd.n), $$0.b(cbd.e), $$0.b(cbd.h), $$0.c(cbd.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     iv $$9 = $$0.b($$3);
                     cbf $$10 = $$0.b($$4);
                     if ($$6.E_().a(100) == 0 && $$6.ae() == $$9.a() && $$9.b().a($$7.dl(), 4.0) && $$10.d($$0xxx -> brn.bi.equals($$0xxx.ai()))) {
                        $$10.a($$1xx -> brn.bi.equals($$1xx.ai()) && $$1xx.g((brh)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bud($$3xx, true));
                           $$1.a(new cbg(new bud($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
