import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byi {
   public static bvj<btp> a(dez $$0) {
      return byv.a(
         (Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$1 -> $$1.group($$1.c(cct.o), $$1.b(cct.m), $$1.b(cct.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.be() && $$3x.aE()) {
                        iz $$5 = $$3x.dp().d();

                        for (je $$6 : je.c.a) {
                           iz $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(je.b).c() && $$2x.b_($$7).b(enw.c)) {
                              iz $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dsc $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dwv.i, $$8, dwv.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, awa.jP, awb.e, 1.0F, 1.0F);
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
