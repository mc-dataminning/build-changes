import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class caw {
   public static cbh<byf> a(int $$0, float $$1, int $$2) {
      return cdj.a(
         (Function<cdj.b<byf>, ? extends App<cdj.c<byf>, cdm<byf>>>)($$3 -> $$3.group(
                  $$3.c(chh.n), $$3.a(chh.b), $$3.a(chh.D), $$3.a(chh.u), $$3.a(chh.o), $$3.a(chh.s), $$3.a(chh.r)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.A()
                           .d($$0xxxx -> $$0xxxx.a(cjl.n), $$0xxxx -> true, $$12.dv(), $$2 + 1, cjh.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dt(), (double)$$2))
                           .or(() -> $$11.A().a($$0xxxxx -> $$0xxxxx.a(cjl.n), $$0xxxxx -> true, cjh.b.c, $$12.dv(), $$0, $$12.dY()))
                           .or(() -> $$3.<jf>a($$5).map(jf::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jf.a($$11.aj(), $$10xx));
                              if (!$$10xx.a($$12.dt(), (double)$$2)) {
                                 $$4.a(new chk($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
