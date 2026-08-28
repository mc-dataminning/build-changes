import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwu {
   public static byi<btz> a(brs $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static byi<btz> a(brs $$0, Function<bve, Float> $$1) {
      return cak.a(
         (Function<cak.b<btz>, ? extends App<cak.c<btz>, can<btz>>>)($$2 -> $$2.group($$2.b(cei.K), $$2.a(cei.n), $$2.c(cei.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        btz $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cel $$10 = new cel(new bxi($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bxi($$9, true));
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
