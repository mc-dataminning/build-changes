import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cat {
   private static final float a = 0.3F;

   public static bzt<bwr> a() {
      return cbv.a(
         (Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$0 -> $$0.group($$0.a(cft.n), $$0.a(cft.o), $$0.b(cft.e), $$0.b(cft.h), $$0.c(cft.r))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jr $$9 = $$0.b($$3);
                     cfv $$10 = $$0.b($$4);
                     if ($$6.C_().a(100) == 0 && $$6.aj() == $$9.a() && $$9.b().a($$7.dt(), 4.0) && $$10.d($$0xxx -> bwb.bC.equals($$0xxx.aq()))) {
                        $$10.a($$1xx -> bwb.bC.equals($$1xx.aq()) && $$1xx.g((bvs)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new byt($$3xx, true));
                           $$1.a(new cfw(new byt($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
