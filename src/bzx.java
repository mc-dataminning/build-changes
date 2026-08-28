import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzx {
   public static bwy<bve> a(dij $$0) {
      return cak.a(
         (Function<cak.b<bve>, ? extends App<cak.c<bve>, can<bve>>>)($$1 -> $$1.group($$1.c(cei.o), $$1.b(cei.m), $$1.b(cei.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bl() && $$3x.aL()) {
                        jh $$5 = $$3x.dy().e();

                        for (jm $$6 : jm.c.a) {
                           jh $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(jm.b).c() && $$2x.b_($$7).b(erp.c)) {
                              jh $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 dvo $$9 = $$0.m();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(eak.i, $$8, eak.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, awo.jQ, awp.e, 1.0F, 1.0F);
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
