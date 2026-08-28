import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byi {
   public static bxn<cnh> a(cdn<jm> $$0, float $$1, int $$2, int $$3, int $$4) {
      return bzp.a(
         (Function<bzp.b<cnh>, ? extends App<bzp.c<cnh>, bzs<cnh>>>)($$5 -> $$5.group($$5.a(cdn.E), $$5.c(cdn.m), $$5.b($$0))
               .apply($$5, ($$6, $$7, $$8) -> ($$9, $$10, $$11) -> {
                     jm $$12 = $$5.b($$8);
                     Optional<Long> $$13 = $$5.a($$6);
                     if ($$12.a() == $$9.ag() && (!$$13.isPresent() || $$9.aa() - $$13.get() <= (long)$$4)) {
                        if ($$12.b().k($$10.ds()) > $$3) {
                           eys $$14 = null;
                           int $$15 = 0;
                           int $$16 = 1000;

                           while ($$14 == null || je.a((jx)$$14).k($$10.ds()) > $$3) {
                              $$14 = cfe.a($$10, 15, 7, eys.c($$12.b()), (float) (Math.PI / 2));
                              if (++$$15 == 1000) {
                                 $$10.a($$0);
                                 $$8.b();
                                 $$6.a($$11);
                                 return true;
                              }
                           }

                           $$7.a(new cdq($$14, $$1, $$2));
                        } else if ($$12.b().k($$10.ds()) > $$2) {
                           $$7.a(new cdq($$12.b(), $$1, $$2));
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
