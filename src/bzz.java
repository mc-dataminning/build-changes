import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzz {
   public static bxa<bvg> a(djl $$0) {
      return cam.a(
         (Function<cam.b<bvg>, ? extends App<cam.c<bvg>, cap<bvg>>>)($$1 -> $$1.group($$1.c(cek.o), $$1.b(cek.m), $$1.b(cek.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bj() && $$3x.aJ()) {
                        ji $$5 = $$3x.dv().e();

                        for (jn $$6 : jn.c.a) {
                           ji $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(jn.b).c() && $$2x.b_($$7).b(esz.c)) {
                              ji $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 dww $$9 = $$0.m();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(ebs.i, $$8, ebs.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, awa.kp, awb.e, 1.0F, 1.0F);
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
