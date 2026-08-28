import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzo {
   public static bwp<buv> a(dhy $$0) {
      return cab.a(
         (Function<cab.b<buv>, ? extends App<cab.c<buv>, cae<buv>>>)($$1 -> $$1.group($$1.c(cdz.o), $$1.b(cdz.m), $$1.b(cdz.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bk() && $$3x.aJ()) {
                        jg $$5 = $$3x.dx().e();

                        for (jl $$6 : jl.c.a) {
                           jg $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).g($$2x, $$7).a(jl.b).c() && $$2x.b_($$7).b(erf.c)) {
                              jg $$8 = $$7.d();
                              if ($$2x.a_($$8).l()) {
                                 dvd $$9 = $$0.m();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(eaa.i, $$8, eaa.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, awk.jQ, awl.e, 1.0F, 1.0F);
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
