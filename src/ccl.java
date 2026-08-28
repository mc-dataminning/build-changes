import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class ccl {
   public static bzm<bxu> a(dnc $$0) {
      return ccy.a(
         (Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$1 -> $$1.group($$1.c(cgw.p), $$1.b(cgw.n), $$1.b(cgw.Z))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bi() && $$3x.aH()) {
                        iv $$5 = $$3x.dv().e();

                        for (jb $$6 : jb.c.a) {
                           iv $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(jb.b).c() && $$2x.b_($$7).b(exp.c)) {
                              iv $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 ebe $$9 = $$0.m();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(ege.i, $$8, ege.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, awp.kt, awq.e, 1.0F, 1.0F);
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
