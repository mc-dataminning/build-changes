import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzj {
   private static final float a = 0.3F;

   public static byj<bvf> a() {
      return cal.a(
         (Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$0 -> $$0.group($$0.a(cej.m), $$0.a(cej.n), $$0.b(cej.e), $$0.b(cej.h), $$0.c(cej.q))
               .apply($$0, ($$1, $$2, $$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     jq $$9 = $$0.b($$3);
                     cel $$10 = $$0.b($$4);
                     if ($$6.H_().a(100) == 0 && $$6.ai() == $$9.a() && $$9.b().a($$7.du(), 4.0) && $$10.d($$0xxx -> buq.bC.equals($$0xxx.aq()))) {
                        $$10.a($$1xx -> buq.bC.equals($$1xx.aq()) && $$1xx.g((buj)$$7) <= 32.0).ifPresent($$3xx -> {
                           $$5.a($$3xx);
                           $$2.a(new bxj($$3xx, true));
                           $$1.a(new cem(new bxj($$3xx, false), 0.3F, 1));
                        });
                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
