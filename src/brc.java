import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brc {
   public static bod<bml> a(cwq $$0) {
      return brp.a(
         (Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$1 -> $$1.group($$1.c(bvn.o), $$1.b(bvn.m), $$1.b(bvn.X))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aZ() && $$3x.aC()) {
                        hx $$5 = $$3x.dm().d();

                        for (ic $$6 : ic.c.a) {
                           hx $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ic.b).c() && $$2x.b_($$7).b(ees.c)) {
                              hx $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 djh $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dnr.i, $$8, dnr.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, ars.jl, art.e, 1.0F, 1.0F);
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
