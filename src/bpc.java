import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bpc {
   public static boh<cdh> a(buh<ia> $$0, float $$1, int $$2, int $$3, int $$4) {
      return bqj.a(
         (Function<bqj.b<cdh>, ? extends App<bqj.c<cdh>, bqm<cdh>>>)($$5 -> $$5.group($$5.a(buh.E), $$5.c(buh.m), $$5.b($$0))
               .apply($$5, ($$6, $$7, $$8) -> ($$9, $$10, $$11) -> {
                     ia $$12 = $$5.b($$8);
                     Optional<Long> $$13 = $$5.a($$6);
                     if ($$12.a() == $$9.ad() && (!$$13.isPresent() || $$9.W() - $$13.get() <= (long)$$4)) {
                        if ($$12.b().k($$10.dn()) > $$3) {
                           eju $$14 = null;
                           int $$15 = 0;
                           int $$16 = 1000;

                           while ($$14 == null || ht.a($$14).k($$10.dn()) > $$3) {
                              $$14 = bvw.a($$10, 15, 7, eju.c($$12.b()), (float) (Math.PI / 2));
                              if (++$$15 == 1000) {
                                 $$10.a($$0);
                                 $$8.b();
                                 $$6.a($$11);
                                 return true;
                              }
                           }

                           $$7.a(new buk($$14, $$1, $$2));
                        } else if ($$12.b().k($$10.dn()) > $$2) {
                           $$7.a(new buk($$12.b(), $$1, $$2));
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
