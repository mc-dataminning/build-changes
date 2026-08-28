import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class caq {
   public static bxr<bvx> a(dkd $$0) {
      return cbd.a(
         (Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$1 -> $$1.group($$1.c(cfb.o), $$1.b(cfb.m), $$1.b(cfb.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bj() && $$3x.aJ()) {
                        jh $$5 = $$3x.dw().e();

                        for (jm $$6 : jm.c.a) {
                           jh $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(jm.b).c() && $$2x.b_($$7).b(etr.c)) {
                              jh $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 dxo $$9 = $$0.m();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(eck.i, $$8, eck.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, awv.kp, aww.e, 1.0F, 1.0F);
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
