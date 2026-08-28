import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byf {
   public static bvg<btl> a(dfw $$0) {
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$1 -> $$1.group($$1.c(ccq.o), $$1.b(ccq.m), $$1.b(ccq.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bf() && $$3x.aF()) {
                        jd $$5 = $$3x.dq().d();

                        for (ji $$6 : ji.c.a) {
                           jd $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ji.b).c() && $$2x.b_($$7).b(eoz.c)) {
                              jd $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dta $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dxw.i, $$8, dxw.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, avo.jP, avp.e, 1.0F, 1.0F);
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
