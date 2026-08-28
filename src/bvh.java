import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvh {
   public static bwv<bsq> a(bqh $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bwv<bsq> a(bqh $$0, Function<btr, Float> $$1) {
      return byx.a(
         (Function<byx.b<bsq>, ? extends App<byx.c<bsq>, bza<bsq>>>)($$2 -> $$2.group($$2.b(ccv.K), $$2.a(ccv.n), $$2.c(ccv.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        bsq $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           ccy $$10 = new ccy(new bvv($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bvv($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
