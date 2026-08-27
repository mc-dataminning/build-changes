import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bws {
   public static btt<bsa> a(dde $$0) {
      return bxf.a(
         (Function<bxf.b<bsa>, ? extends App<bxf.c<bsa>, bxi<bsa>>>)($$1 -> $$1.group($$1.c(cbd.o), $$1.b(cbd.m), $$1.b(cbd.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bc() && $$3x.aC()) {
                        in $$5 = $$3x.dn().d();

                        for (is $$6 : is.c.a) {
                           in $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(is.b).c() && $$2x.b_($$7).b(emb.c)) {
                              in $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dqh $$9 = $$0.n();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dva.i, $$8, dva.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, avc.jK, avd.e, 1.0F, 1.0F);
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
