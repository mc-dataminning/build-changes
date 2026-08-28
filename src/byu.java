import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class byu {
   public static bxz<cnt> a(cdz<jo> $$0, float $$1, int $$2, int $$3, int $$4) {
      return cab.a(
         (Function<cab.b<cnt>, ? extends App<cab.c<cnt>, cae<cnt>>>)($$5 -> $$5.group($$5.a(cdz.E), $$5.c(cdz.m), $$5.b($$0))
               .apply($$5, ($$6, $$7, $$8) -> ($$9, $$10, $$11) -> {
                     jo $$12 = $$5.b($$8);
                     Optional<Long> $$13 = $$5.a($$6);
                     if ($$12.a() == $$9.ag() && (!$$13.isPresent() || $$9.aa() - $$13.get() <= (long)$$4)) {
                        if ($$12.b().k($$10.dx()) > $$3) {
                           ezh $$14 = null;
                           int $$15 = 0;
                           int $$16 = 1000;

                           while ($$14 == null || jg.a((jz)$$14).k($$10.dx()) > $$3) {
                              $$14 = cfq.a($$10, 15, 7, ezh.c($$12.b()), (float) (Math.PI / 2));
                              if (++$$15 == 1000) {
                                 $$10.a($$0);
                                 $$8.b();
                                 $$6.a($$11);
                                 return true;
                              }
                           }

                           $$7.a(new cec($$14, $$1, $$2));
                        } else if ($$12.b().k($$10.dx()) > $$2) {
                           $$7.a(new cec($$12.b(), $$1, $$2));
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
