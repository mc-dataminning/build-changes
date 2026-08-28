import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxv {
   public static buw<btc> a(dfi $$0) {
      return byi.a(
         (Function<byi.b<btc>, ? extends App<byi.c<btc>, byl<btc>>>)($$1 -> $$1.group($$1.c(ccg.o), $$1.b(ccg.m), $$1.b(ccg.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bg() && $$3x.aG()) {
                        ja $$5 = $$3x.dr().d();

                        for (jf $$6 : jf.c.a) {
                           ja $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(jf.b).c() && $$2x.b_($$7).b(eok.c)) {
                              ja $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dsl $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dxh.i, $$8, dxh.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, avh.jP, avi.e, 1.0F, 1.0F);
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
