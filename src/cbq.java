import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cbq {
   public static byr<bwz> a(dlu $$0) {
      return ccd.a(
         (Function<ccd.b<bwz>, ? extends App<ccd.c<bwz>, ccg<bwz>>>)($$1 -> $$1.group($$1.c(cgb.p), $$1.b(cgb.n), $$1.b(cgb.Z))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bj() && $$3x.aJ()) {
                        iu $$5 = $$3x.dv().e();

                        for (ja $$6 : ja.c.a) {
                           iu $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(ja.b).c() && $$2x.b_($$7).b(evw.c)) {
                              iu $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 dzo $$9 = $$0.m();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(eeo.i, $$8, eeo.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, awl.kp, awm.e, 1.0F, 1.0F);
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
