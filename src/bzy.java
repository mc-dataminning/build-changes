import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzy {
   public static bwz<bvf> a(djk $$0) {
      return cal.a(
         (Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$1 -> $$1.group($$1.c(cej.o), $$1.b(cej.m), $$1.b(cej.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bj() && $$3x.aJ()) {
                        ji $$5 = $$3x.dw().e();

                        for (jn $$6 : jn.c.a) {
                           ji $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(jn.b).c() && $$2x.b_($$7).b(esy.c)) {
                              ji $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 dwv $$9 = $$0.m();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(ebr.i, $$8, ebr.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, avz.kp, awa.e, 1.0F, 1.0F);
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
