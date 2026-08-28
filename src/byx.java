import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byx {
   public static bvy<buf> a(dgv $$0) {
      return bzk.a(
         (Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$1 -> $$1.group($$1.c(cdi.o), $$1.b(cdi.m), $$1.b(cdi.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bi() && $$3x.aH()) {
                        je $$5 = $$3x.ds().e();

                        for (jj $$6 : jj.c.a) {
                           je $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(jj.b).c() && $$2x.b_($$7).b(eqc.c)) {
                              je $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 dua $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dyx.i, $$8, dyx.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, awd.jQ, awe.e, 1.0F, 1.0F);
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
