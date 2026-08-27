import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpo {
   public static bmq<bky> a(cut $$0) {
      return bqb.a(
         (Function<bqb.b<bky>, ? extends App<bqb.c<bky>, bqe<bky>>>)($$1 -> $$1.group($$1.c(btz.o), $$1.b(btz.m), $$1.b(btz.X))
               .apply($$1, ($$1x, $$2, $$3) -> ($$2x, $$3x, $$4) -> {
                     if (!$$3x.aX() && $$3x.aA()) {
                        ht $$5 = $$3x.dl().d();

                        for (hx $$6 : hx.c.a) {
                           ht $$7 = $$5.a($$6);
                           if ($$2x.a_($$7).k($$2x, $$7).a(hx.b).c() && $$2x.b_($$7).b(ech.c)) {
                              ht $$8 = $$7.c();
                              if ($$2x.a_($$8).i()) {
                                 dgw $$9 = $$0.o();
                                 $$2x.a($$8, $$9, 3);
                                 $$2x.a(dlg.i, $$8, dlg.a.a($$3x, $$9));
                                 $$2x.a(null, $$3x, aqn.iM, aqo.e, 1.0F, 1.0F);
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
