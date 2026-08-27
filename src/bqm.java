import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqm {
   public static bnn<blv> a(cvz $$0) {
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$1 -> $$1.group($$1.c(bux.o), $$1.b(bux.m), $$1.b(bux.X))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aZ() && $$3x.aC()) {
                        hv $$5 = $$3x.dm().d();

                        for (ia $$6 : ia.c.a) {
                           hv $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ia.b).c() && $$2x.b_($$7).b(eea.c)) {
                              hv $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dip $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dmz.i, $$8, dmz.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, arc.jl, ard.e, 1.0F, 1.0F);
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
