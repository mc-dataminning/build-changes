import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class bum {
   public static btr<cjg> a(bzr<ik> $$0, float $$1, int $$2, int $$3, int $$4) {
      return bvt.a(
         (Function<bvt.b<cjg>, ? extends App<bvt.c<cjg>, bvw<cjg>>>)($$5 -> $$5.group($$5.a(bzr.E), $$5.c(bzr.m), $$5.b($$0))
               .apply($$5, ($$6, $$7, $$8) -> ($$9, $$10, $$11) -> {
                     ik $$12 = $$5.b($$8);
                     Optional<Long> $$13 = $$5.a($$6);
                     if ($$12.a() == $$9.ae() && (!$$13.isPresent() || $$9.Y() - $$13.get() <= (long)$$4)) {
                        if ($$12.b().k($$10.dm()) > $$3) {
                           esa $$14 = null;
                           int $$15 = 0;
                           int $$16 = 1000;

                           while ($$14 == null || ib.a($$14).k($$10.dm()) > $$3) {
                              $$14 = cbi.a($$10, 15, 7, esa.c($$12.b()), (float) (Math.PI / 2));
                              if (++$$15 == 1000) {
                                 $$10.a($$0);
                                 $$8.b();
                                 $$6.a($$11);
                                 return true;
                              }
                           }

                           $$7.a(new bzu($$14, $$1, $$2));
                        } else if ($$12.b().k($$10.dm()) > $$2) {
                           $$7.a(new bzu($$12.b(), $$1, $$2));
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
