import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byr {
   public static bzc<bvy> a(int $$0, float $$1, int $$2) {
      return cbe.a(
         (Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$3 -> $$3.group(
                  $$3.c(cfc.m), $$3.a(cfc.b), $$3.a(cfc.C), $$3.a(cfc.t), $$3.a(cfc.n), $$3.a(cfc.r), $$3.a(cfc.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.A()
                           .d($$0xxxx -> $$0xxxx.a(chg.n), $$0xxxx -> true, $$12.du(), $$2 + 1, chc.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.ds(), (double)$$2))
                           .or(() -> $$11.A().a($$0xxxxx -> $$0xxxxx.a(chg.n), $$0xxxxx -> true, chc.b.c, $$12.du(), $$0, $$12.dX()))
                           .or(() -> $$3.<jq>a($$5).map(jq::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jq.a($$11.aj(), $$10xx));
                              if (!$$10xx.a($$12.ds(), (double)$$2)) {
                                 $$4.a(new cff($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
