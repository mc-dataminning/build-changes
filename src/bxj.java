import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxj {
   public static buk<bsq> a(dea $$0) {
      return bxw.a(
         (Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$1 -> $$1.group($$1.c(cbu.o), $$1.b(cbu.m), $$1.b(cbu.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.be() && $$3x.aE()) {
                        io $$5 = $$3x.dp().d();

                        for (it $$6 : it.c.a) {
                           io $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(it.b).c() && $$2x.b_($$7).b(emx.c)) {
                              io $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 drd $$9 = $$0.n();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dvw.i, $$8, dvw.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, avi.jP, avj.e, 1.0F, 1.0F);
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
