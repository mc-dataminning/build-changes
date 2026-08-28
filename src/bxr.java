import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxr {
   public static bus<bsy> a(dff $$0) {
      return bye.a(
         (Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$1 -> $$1.group($$1.c(ccc.o), $$1.b(ccc.m), $$1.b(ccc.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.be() && $$3x.aE()) {
                        ja $$5 = $$3x.dp().d();

                        for (jf $$6 : jf.c.a) {
                           ja $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(jf.b).c() && $$2x.b_($$7).b(eoc.c)) {
                              ja $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dsh $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dxa.i, $$8, dxa.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, avf.jP, avg.e, 1.0F, 1.0F);
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
