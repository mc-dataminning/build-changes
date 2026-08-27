import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class boc {
   public static ble<bjm> a(ctc $$0) {
      return bop.a(
         (Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$1 -> $$1.group($$1.c(bsn.o), $$1.b(bsn.m), $$1.b(bsn.X))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aX() && $$3x.aA()) {
                        gw $$5 = $$3x.dl().d();

                        for (ha $$6 : ha.c.a) {
                           gw $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ha.b).c() && $$2x.b_($$7).b(eah.c)) {
                              gw $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dfd $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(djn.i, $$8, djn.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, apg.iI, aph.e, 1.0F, 1.0F);
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
