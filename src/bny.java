import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bny {
   public static bla<bji> a(csx $$0) {
      return bol.a(
         (Function<bol.b<bji>, ? extends App<bol.c<bji>, boo<bji>>>)($$1 -> $$1.group($$1.c(bsj.o), $$1.b(bsj.m), $$1.b(bsj.X))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aX() && $$3x.aA()) {
                        gw $$5 = $$3x.dl().d();

                        for (hc $$6 : hc.c.a) {
                           gw $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(hc.b).c() && $$2x.b_($$7).b(eap.c)) {
                              gw $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dfl $$9 = $$0.n();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(djv.i, $$8, djv.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, apf.iI, apg.e, 1.0F, 1.0F);
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
