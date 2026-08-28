import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cbi {
   public static byj<bwr> a(dku $$0) {
      return cbv.a(
         (Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$1 -> $$1.group($$1.c(cft.p), $$1.b(cft.n), $$1.b(cft.Z))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bj() && $$3x.aJ()) {
                        jj $$5 = $$3x.dv().e();

                        for (jo $$6 : jo.c.a) {
                           jj $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(jo.b).c() && $$2x.b_($$7).b(euu.c)) {
                              jj $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 dym $$9 = $$0.m();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(edm.i, $$8, edm.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, awk.kp, awl.e, 1.0F, 1.0F);
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
