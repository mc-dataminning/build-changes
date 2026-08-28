import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bzw {
   public static bzb<cpa> a(cfb<jp> $$0, float $$1, int $$2, int $$3, int $$4) {
      return cbd.a(
         (Function<cbd.b<cpa>, ? extends App<cbd.c<cpa>, cbg<cpa>>>)($$5 -> $$5.group($$5.a(cfb.E), $$5.c(cfb.m), $$5.b($$0))
               .apply($$5, ($$6, $$7, $$8) -> ($$9, $$10, $$11) -> {
                     jp $$12 = $$5.b($$8);
                     Optional<Long> $$13 = $$5.a($$6);
                     if ($$12.a() == $$9.ai() && (!$$13.isPresent() || $$9.ad() - $$13.get() <= (long)$$4)) {
                        if ($$12.b().k($$10.dw()) > $$3) {
                           fbr $$14 = null;
                           int $$15 = 0;
                           int $$16 = 1000;

                           while ($$14 == null || jh.a((ka)$$14).k($$10.dw()) > $$3) {
                              $$14 = cgs.a($$10, 15, 7, fbr.c($$12.b()), (float) (Math.PI / 2));
                              if (++$$15 == 1000) {
                                 $$10.a($$0);
                                 $$8.b();
                                 $$6.a($$11);
                                 return true;
                              }
                           }

                           $$7.a(new cfe($$14, $$1, $$2));
                        } else if ($$12.b().k($$10.dw()) > $$2) {
                           $$7.a(new cfe($$12.b(), $$1, $$2));
                        }
                     } else {
                        $$10.a($$0);
                        $$8.b();
                        $$6.a($$11);
                     }

                     return true;
                  }))
      );
   }
}
