import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvg {
   public static bsh<bqo> a(dby $$0) {
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$1 -> $$1.group($$1.c(bzr.o), $$1.b(bzr.m), $$1.b(bzr.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bc() && $$3x.aC()) {
                        ib $$5 = $$3x.dm().d();

                        for (ih $$6 : ih.c.a) {
                           ib $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ih.b).c() && $$2x.b_($$7).b(ekt.c)) {
                              ib $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 doz $$9 = $$0.n();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dts.i, $$8, dts.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, aum.jK, aun.e, 1.0F, 1.0F);
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
