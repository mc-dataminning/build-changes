import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bta {
   public static bqb<boi> a(cys $$0) {
      return btn.a(
         (Function<btn.b<boi>, ? extends App<btn.c<boi>, btq<boi>>>)($$1 -> $$1.group($$1.c(bxl.o), $$1.b(bxl.m), $$1.b(bxl.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aZ() && $$3x.aC()) {
                        hz $$5 = $$3x.dm().d();

                        for (ie $$6 : ie.c.a) {
                           hz $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ie.b).c() && $$2x.b_($$7).b(egx.c)) {
                              hz $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dlj $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dpw.i, $$8, dpw.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, atl.jB, atm.e, 1.0F, 1.0F);
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
