import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnr {
   public static bkt<bjb> a(csq $$0) {
      return boe.a(
         (Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$1 -> $$1.group($$1.c(bsc.o), $$1.b(bsc.m), $$1.b(bsc.X))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aX() && $$3x.aA()) {
                        gw $$5 = $$3x.dk().d();

                        for (hc $$6 : hc.c.a) {
                           gw $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(hc.b).c() && $$2x.b_($$7).b(eai.c)) {
                              gw $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dfe $$9 = $$0.n();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(djo.i, $$8, djo.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, aoz.iI, apa.e, 1.0F, 1.0F);
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
