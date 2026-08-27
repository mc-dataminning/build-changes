import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnn {
   public static bkp<biw> a(csk $$0) {
      return boa.a(
         (Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$1 -> $$1.group($$1.c(bry.o), $$1.b(bry.m), $$1.b(bry.X))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aX() && $$3x.aA()) {
                        gv $$5 = $$3x.dk().d();

                        for (hb $$6 : hb.c.a) {
                           gv $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(hb.b).c() && $$2x.b_($$7).b(eac.c)) {
                              gv $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dey $$9 = $$0.n();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dji.i, $$8, dji.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, aou.iI, aov.e, 1.0F, 1.0F);
                                 $$3.b();
                                 return true;
                              }
                           }
                        }

                        return true;
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
