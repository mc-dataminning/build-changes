import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class can {
   public static cay<bxw> a(int $$0, float $$1, int $$2) {
      return cda.a(
         (Function<cda.b<bxw>, ? extends App<cda.c<bxw>, cdd<bxw>>>)($$3 -> $$3.group(
                  $$3.c(cgy.n), $$3.a(cgy.b), $$3.a(cgy.D), $$3.a(cgy.u), $$3.a(cgy.o), $$3.a(cgy.s), $$3.a(cgy.r)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.A()
                           .d($$0xxxx -> $$0xxxx.a(cjc.n), $$0xxxx -> true, $$12.dv(), $$2 + 1, ciy.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dt(), (double)$$2))
                           .or(() -> $$11.A().a($$0xxxxx -> $$0xxxxx.a(cjc.n), $$0xxxxx -> true, ciy.b.c, $$12.dv(), $$0, $$12.dY()))
                           .or(() -> $$3.<jf>a($$5).map(jf::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jf.a($$11.aj(), $$10xx));
                              if (!$$10xx.a($$12.dt(), (double)$$2)) {
                                 $$4.a(new chb($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
