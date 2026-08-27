import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqb {
   public static bnd<bll> a(cvf $$0) {
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$1 -> $$1.group($$1.c(bum.o), $$1.b(bum.m), $$1.b(bum.X))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aZ() && $$3x.aC()) {
                        hx $$5 = $$3x.dn().d();

                        for (ib $$6 : ib.c.a) {
                           hx $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ib.b).c() && $$2x.b_($$7).b(ecy.c)) {
                              hx $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dhn $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dlx.i, $$8, dlx.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, aqv.jc, aqw.e, 1.0F, 1.0F);
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
