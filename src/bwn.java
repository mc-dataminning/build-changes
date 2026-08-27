import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bwn {
   public static bvs<clj> a(cbs<iw> $$0, float $$1, int $$2, int $$3, int $$4) {
      return bxu.a(
         (Function<bxu.b<clj>, ? extends App<bxu.c<clj>, bxx<clj>>>)($$5 -> $$5.group($$5.a(cbs.E), $$5.c(cbs.m), $$5.b($$0))
               .apply($$5, ($$6, $$7, $$8) -> ($$9, $$10, $$11) -> {
                     iw $$12 = $$5.b($$8);
                     Optional<Long> $$13 = $$5.a($$6);
                     if ($$12.a() == $$9.ae() && (!$$13.isPresent() || $$9.Y() - $$13.get() <= (long)$$4)) {
                        if ($$12.b().k($$10.dp()) > $$3) {
                           euk $$14 = null;
                           int $$15 = 0;
                           int $$16 = 1000;

                           while ($$14 == null || io.a($$14).k($$10.dp()) > $$3) {
                              $$14 = cdj.a($$10, 15, 7, euk.c($$12.b()), (float) (Math.PI / 2));
                              if (++$$15 == 1000) {
                                 $$10.a($$0);
                                 $$8.b();
                                 $$6.a($$11);
                                 return true;
                              }
                           }

                           $$7.a(new cbv($$14, $$1, $$2));
                        } else if ($$12.b().k($$10.dp()) > $$2) {
                           $$7.a(new cbv($$12.b(), $$1, $$2));
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
