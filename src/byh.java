import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byh {
   public static bvi<bto> a(dey $$0) {
      return byu.a(
         (Function<byu.b<bto>, ? extends App<byu.c<bto>, byx<bto>>>)($$1 -> $$1.group($$1.c(ccs.o), $$1.b(ccs.m), $$1.b(ccs.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.be() && $$3x.aE()) {
                        iz $$5 = $$3x.dp().d();

                        for (je $$6 : je.c.a) {
                           iz $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(je.b).c() && $$2x.b_($$7).b(env.c)) {
                              iz $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dsb $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dwu.i, $$8, dwu.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, avz.jP, awa.e, 1.0F, 1.0F);
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
