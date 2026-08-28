import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzf {
   public static bwg<bun> a(dhm $$0) {
      return bzs.a(
         (Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$1 -> $$1.group($$1.c(cdq.o), $$1.b(cdq.m), $$1.b(cdq.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bi() && $$3x.aH()) {
                        jf $$5 = $$3x.ds().e();

                        for (jk $$6 : jk.c.a) {
                           jf $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(jk.b).c() && $$2x.b_($$7).b(equ.c)) {
                              jf $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 dus $$9 = $$0.n();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dzp.i, $$8, dzp.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, awg.jQ, awh.e, 1.0F, 1.0F);
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
