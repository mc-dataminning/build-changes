import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bsw {
   public static bpx<bog> a(cyo $$0) {
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$1 -> $$1.group($$1.c(bxh.o), $$1.b(bxh.m), $$1.b(bxh.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aZ() && $$3x.aC()) {
                        hz $$5 = $$3x.dm().d();

                        for (ie $$6 : ie.c.a) {
                           hz $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ie.b).c() && $$2x.b_($$7).b(egq.c)) {
                              hz $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dlf $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dpp.i, $$8, dpp.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, atk.jA, atl.e, 1.0F, 1.0F);
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
