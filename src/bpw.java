import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpw {
   public static bmy<blg> a(cva $$0) {
      return bqj.a(
         (Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$1 -> $$1.group($$1.c(buh.o), $$1.b(buh.m), $$1.b(buh.X))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aZ() && $$3x.aC()) {
                        ht $$5 = $$3x.dn().d();

                        for (hx $$6 : hx.c.a) {
                           ht $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(hx.b).c() && $$2x.b_($$7).b(ect.c)) {
                              ht $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dhi $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dls.i, $$8, dls.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, aqr.jc, aqs.e, 1.0F, 1.0F);
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
