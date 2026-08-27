import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bou {
   public static bnz<ccz> a(btz<ia> $$0, float $$1, int $$2, int $$3, int $$4) {
      return bqb.a(
         (Function<bqb.b<ccz>, ? extends App<bqb.c<ccz>, bqe<ccz>>>)($$5 -> $$5.group($$5.a(btz.E), $$5.c(btz.m), $$5.b($$0))
               .apply($$5, ($$6, $$7, $$8) -> ($$9, $$10, $$11) -> {
                     ia $$12 = $$5.b($$8);
                     Optional<Long> $$13 = $$5.a($$6);
                     if ($$12.a() == $$9.ac() && (!$$13.isPresent() || $$9.V() - $$13.get() <= (long)$$4)) {
                        if ($$12.b().k($$10.dl()) > $$3) {
                           eji $$14 = null;
                           int $$15 = 0;
                           int $$16 = 1000;

                           while ($$14 == null || ht.a($$14).k($$10.dl()) > $$3) {
                              $$14 = bvo.a($$10, 15, 7, eji.c($$12.b()), (float) (Math.PI / 2));
                              if (++$$15 == 1000) {
                                 $$10.a($$0);
                                 $$8.b();
                                 $$6.a($$11);
                                 return true;
                              }
                           }

                           $$7.a(new buc($$14, $$1, $$2));
                        } else if ($$12.b().k($$10.dl()) > $$2) {
                           $$7.a(new buc($$12.b(), $$1, $$2));
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
