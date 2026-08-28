import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvc {
   public static bwq<bsk> a(bqb $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bwq<bsk> a(bqb $$0, Function<btl, Float> $$1) {
      return bys.a(
         (Function<bys.b<bsk>, ? extends App<bys.c<bsk>, byv<bsk>>>)($$2 -> $$2.group($$2.b(ccq.K), $$2.a(ccq.n), $$2.c(ccq.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.o_()) {
                        return false;
                     } else {
                        bsk $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           cct $$10 = new cct(new bvq($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bvq($$9, true));
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
