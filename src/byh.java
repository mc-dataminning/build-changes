import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byh {
   public static bvi<btn> a(dfy $$0) {
      return byu.a(
         (Function<byu.b<btn>, ? extends App<byu.c<btn>, byx<btn>>>)($$1 -> $$1.group($$1.c(ccs.o), $$1.b(ccs.m), $$1.b(ccs.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bf() && $$3x.aF()) {
                        jd $$5 = $$3x.dp().e();

                        for (ji $$6 : ji.c.a) {
                           jd $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ji.b).c() && $$2x.b_($$7).b(epd.c)) {
                              jd $$8 = $$7.d();
                              if ($$2x.a_($$8).i()) {
                                 dtc $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dxz.i, $$8, dxz.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, avp.jP, avq.e, 1.0F, 1.0F);
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
