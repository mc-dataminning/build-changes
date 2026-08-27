import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brf {
   public static bog<bmo> a(cwy $$0) {
      return brs.a(
         (Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$1 -> $$1.group($$1.c(bvq.o), $$1.b(bvq.m), $$1.b(bvq.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aZ() && $$3x.aC()) {
                        hx $$5 = $$3x.dl().d();

                        for (ic $$6 : ic.c.a) {
                           hx $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(ic.b).c() && $$2x.b_($$7).b(efa.c)) {
                              hx $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 djp $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dnz.i, $$8, dnz.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, art.jA, aru.e, 1.0F, 1.0F);
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
