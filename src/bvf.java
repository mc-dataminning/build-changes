import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvf {
   public static bwt<bso> a(bqf $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bwt<bso> a(bqf $$0, Function<btp, Float> $$1) {
      return byv.a(
         (Function<byv.b<bso>, ? extends App<byv.c<bso>, byy<bso>>>)($$2 -> $$2.group($$2.b(cct.K), $$2.a(cct.n), $$2.c(cct.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.p_()) {
                        return false;
                     } else {
                        bso $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           ccw $$10 = new ccw(new bvt($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bvt($$9, true));
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
