import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bur {
   public static bwf<bsa> a(bpr $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bwf<bsa> a(bpr $$0, Function<btb, Float> $$1) {
      return byh.a(
         (Function<byh.b<bsa>, ? extends App<byh.c<bsa>, byk<bsa>>>)($$2 -> $$2.group($$2.b(ccf.K), $$2.a(ccf.n), $$2.c(ccf.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        bsa $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cci $$10 = new cci(new bvf($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bvf($$9, true));
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
