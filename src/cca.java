import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cca {
   public static bzb<bxj> a(dmm $$0) {
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$1 -> $$1.group($$1.c(cgl.p), $$1.b(cgl.n), $$1.b(cgl.Z))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bh() && $$3x.aH()) {
                        iv $$5 = $$3x.du().e();

                        for (jb $$6 : jb.c.a) {
                           iv $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(jb.b).c() && $$2x.b_($$7).b(eww.c)) {
                              iv $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 eao $$9 = $$0.m();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(efo.i, $$8, efo.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, awn.kt, awo.e, 1.0F, 1.0F);
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
