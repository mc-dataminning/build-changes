import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class btp {
   public static bqq<box> a(czf $$0) {
      return buc.a(
         (Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$1 -> $$1.group($$1.c(bya.o), $$1.b(bya.m), $$1.b(bya.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aZ() && $$3x.aC()) {
                        ib $$5 = $$3x.dj().d();

                        for (ih $$6 : ih.c.a) {
                           ib $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ih.b).c() && $$2x.b_($$7).b(ehs.c)) {
                              ib $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dme $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dqr.i, $$8, dqr.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, atp.jB, atq.e, 1.0F, 1.0F);
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
