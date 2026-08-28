import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class cal {
   public static caw<bxu> a(int $$0, float $$1, int $$2) {
      return ccy.a(
         (Function<ccy.b<bxu>, ? extends App<ccy.c<bxu>, cdb<bxu>>>)($$3 -> $$3.group(
                  $$3.c(cgw.n), $$3.a(cgw.b), $$3.a(cgw.D), $$3.a(cgw.u), $$3.a(cgw.o), $$3.a(cgw.s), $$3.a(cgw.r)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.A()
                           .d($$0xxxx -> $$0xxxx.a(cja.n), $$0xxxx -> true, $$12.dv(), $$2 + 1, ciw.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dt(), (double)$$2))
                           .or(() -> $$11.A().a($$0xxxxx -> $$0xxxxx.a(cja.n), $$0xxxxx -> true, ciw.b.c, $$12.dv(), $$0, $$12.dY()))
                           .or(() -> $$3.<je>a($$5).map(je::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(je.a($$11.aj(), $$10xx));
                              if (!$$10xx.a($$12.dt(), (double)$$2)) {
                                 $$4.a(new cgz($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
