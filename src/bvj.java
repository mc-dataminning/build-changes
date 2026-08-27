import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvj {
   public static bvu<bsq> a(int $$0, float $$1, int $$2) {
      return bxw.a(
         (Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$3 -> $$3.group(
                  $$3.c(cbu.m), $$3.a(cbu.b), $$3.a(cbu.C), $$3.a(cbu.t), $$3.a(cbu.n), $$3.a(cbu.r), $$3.a(cbu.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(cdy.n), $$0xxxx -> true, $$12.dp(), $$2 + 1, cdu.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dn(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(cdy.n), $$0xxxxx -> true, cdu.b.c, $$12.dp(), $$0, $$12.el()))
                           .or(() -> $$3.<iw>a($$5).map(iw::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(iw.a($$11.ae(), $$10xx));
                              if (!$$10xx.a($$12.dn(), (double)$$2)) {
                                 $$4.a(new cbx($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
