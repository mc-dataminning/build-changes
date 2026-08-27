import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class boz {
   public static bmb<bkj> a(cua $$0) {
      return bpm.a(
         (Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$1 -> $$1.group($$1.c(btk.o), $$1.b(btk.m), $$1.b(btk.X))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aX() && $$3x.aA()) {
                        ht $$5 = $$3x.dl().d();

                        for (hx $$6 : hx.c.a) {
                           ht $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(hx.b).c() && $$2x.b_($$7).b(ebf.c)) {
                              ht $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dgb $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dkl.i, $$8, dkl.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, aqd.iK, aqe.e, 1.0F, 1.0F);
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
