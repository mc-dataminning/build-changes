import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxu {
   public static buv<btb> a(dfh $$0) {
      return byh.a(
         (Function<byh.b<btb>, ? extends App<byh.c<btb>, byk<btb>>>)($$1 -> $$1.group($$1.c(ccf.o), $$1.b(ccf.m), $$1.b(ccf.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bf() && $$3x.aF()) {
                        ja $$5 = $$3x.dq().d();

                        for (jf $$6 : jf.c.a) {
                           ja $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(jf.b).c() && $$2x.b_($$7).b(eoi.c)) {
                              ja $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dsk $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dxg.i, $$8, dxg.a.a($$3x, $$9));
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
