import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class buh {
   public static bri<bpp> a(dac $$0) {
      return buu.a(
         (Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$1 -> $$1.group($$1.c(bys.o), $$1.b(bys.m), $$1.b(bys.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bc() && $$3x.aC()) {
                        ib $$5 = $$3x.dm().d();

                        for (ih $$6 : ih.c.a) {
                           ib $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ih.b).c() && $$2x.b_($$7).b(eiq.c)) {
                              ib $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dnb $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(drp.i, $$8, drp.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, aty.jI, atz.e, 1.0F, 1.0F);
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
