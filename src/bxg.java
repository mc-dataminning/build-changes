import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxg {
   public static buh<bso> a(dfc $$0) {
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$1 -> $$1.group($$1.c(cbr.o), $$1.b(cbr.m), $$1.b(cbr.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bi() && $$3x.aE()) {
                        ir $$5 = $$3x.du().d();

                        for (iw $$6 : iw.c.a) {
                           ir $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(iw.b).c() && $$2x.b_($$7).b(epf.c)) {
                              ir $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dtc $$9 = $$0.n();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dxv.i, $$8, dxv.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, avo.kc, avq.e, 1.0F, 1.0F);
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
