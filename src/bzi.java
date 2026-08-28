import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzi {
   public static bzt<bwr> a(int $$0, float $$1, int $$2) {
      return cbv.a(
         (Function<cbv.b<bwr>, ? extends App<cbv.c<bwr>, cby<bwr>>>)($$3 -> $$3.group(
                  $$3.c(cft.n), $$3.a(cft.b), $$3.a(cft.D), $$3.a(cft.u), $$3.a(cft.o), $$3.a(cft.s), $$3.a(cft.r)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.A()
                           .d($$0xxxx -> $$0xxxx.a(chx.n), $$0xxxx -> true, $$12.dv(), $$2 + 1, cht.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dt(), (double)$$2))
                           .or(() -> $$11.A().a($$0xxxxx -> $$0xxxxx.a(chx.n), $$0xxxxx -> true, cht.b.c, $$12.dv(), $$0, $$12.dY()))
                           .or(() -> $$3.<jr>a($$5).map(jr::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jr.a($$11.aj(), $$10xx));
                              if (!$$10xx.a($$12.dt(), (double)$$2)) {
                                 $$4.a(new cfw($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
