import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvd {
   public static bwr<bsm> a(bqd $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bwr<bsm> a(bqd $$0, Function<btn, Float> $$1) {
      return byt.a(
         (Function<byt.b<bsm>, ? extends App<byt.c<bsm>, byw<bsm>>>)($$2 -> $$2.group($$2.b(ccr.K), $$2.a(ccr.n), $$2.c(ccr.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        bsm $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           ccu $$10 = new ccu(new bvr($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bvr($$9, true));
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
