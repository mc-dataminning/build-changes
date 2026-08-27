import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnp {
   public static bkr<biy> a(csm $$0) {
      return boc.a(
         (Function<boc.b<biy>, ? extends App<boc.c<biy>, bof<biy>>>)($$1 -> $$1.group($$1.c(bsa.o), $$1.b(bsa.m), $$1.b(bsa.X))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aX() && $$3x.aA()) {
                        gu $$5 = $$3x.dk().d();

                        for (ha $$6 : ha.c.a) {
                           gu $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ha.b).c() && $$2x.b_($$7).b(eae.c)) {
                              gu $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dfa $$9 = $$0.n();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(djk.i, $$8, djk.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, aow.iI, aox.e, 1.0F, 1.0F);
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
