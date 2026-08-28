import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvu {
   public static bxi<btc> a(bqv $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bxi<btc> a(bqv $$0, Function<buf, Float> $$1) {
      return bzk.a(
         (Function<bzk.b<btc>, ? extends App<bzk.c<btc>, bzn<btc>>>)($$2 -> $$2.group($$2.b(cdi.K), $$2.a(cdi.n), $$2.c(cdi.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        btc $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cdl $$10 = new cdl(new bwi($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bwi($$9, true));
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
