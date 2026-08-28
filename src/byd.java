import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byd {
   public static bve<btk> a(deu $$0) {
      return byq.a(
         (Function<byq.b<btk>, ? extends App<byq.c<btk>, byt<btk>>>)($$1 -> $$1.group($$1.c(cco.o), $$1.b(cco.m), $$1.b(cco.Y))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.be() && $$3x.aE()) {
                        iz $$5 = $$3x.dp().d();

                        for (je $$6 : je.c.a) {
                           iz $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(je.b).c() && $$2x.b_($$7).b(enr.c)) {
                              iz $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 drx $$9 = $$0.n();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dwq.i, $$8, dwq.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, avw.jP, avx.e, 1.0F, 1.0F);
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
