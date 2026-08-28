import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cay {
   public static bxz<bwf> a(dkl $$0) {
      return cbl.a(
         (Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$1 -> $$1.group($$1.c(cfj.o), $$1.b(cfj.m), $$1.b(cfj.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bj() && $$3x.aJ()) {
                        jh $$5 = $$3x.dw().e();

                        for (jm $$6 : jm.c.a) {
                           jh $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(jm.b).c() && $$2x.b_($$7).b(etx.c)) {
                              jh $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 dxu $$9 = $$0.m();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(ecq.i, $$8, ecq.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, axf.kj, axg.e, 1.0F, 1.0F);
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
