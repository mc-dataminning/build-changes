import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvl {
   public static bsm<bqt> a(dch $$0) {
      return bvy.a(
         (Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$1 -> $$1.group($$1.c(bzw.o), $$1.b(bzw.m), $$1.b(bzw.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.bc() && $$3x.aC()) {
                        id $$5 = $$3x.dm().d();

                        for (ij $$6 : ij.c.a) {
                           id $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ij.b).c() && $$2x.b_($$7).b(elc.c)) {
                              id $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dpi $$9 = $$0.n();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dub.i, $$8, dub.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, auo.jK, aup.e, 1.0F, 1.0F);
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
