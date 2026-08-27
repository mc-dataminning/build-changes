import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvw {
   public static bsx<bre> a(dcv $$0) {
      return bwj.a(
         (Function<bwj.b<bre>, ? extends App<bwj.c<bre>, bwm<bre>>>)($$1 -> $$1.group($$1.c(cah.o), $$1.b(cah.m), $$1.b(cah.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bc() && $$3x.aC()) {
                        im $$5 = $$3x.dn().d();

                        for (ir $$6 : ir.c.a) {
                           im $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ir.b).c() && $$2x.b_($$7).b(els.c)) {
                              im $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dpy $$9 = $$0.n();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dur.i, $$8, dur.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, auz.jK, ava.e, 1.0F, 1.0F);
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
