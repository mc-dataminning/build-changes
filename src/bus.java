import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bus {
   public static bwg<bsb> a(bps $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bwg<bsb> a(bps $$0, Function<btc, Float> $$1) {
      return byi.a(
         (Function<byi.b<bsb>, ? extends App<byi.c<bsb>, byl<bsb>>>)($$2 -> $$2.group($$2.b(ccg.K), $$2.a(ccg.n), $$2.c(ccg.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        bsb $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           ccj $$10 = new ccj(new bvg($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bvg($$9, true));
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
