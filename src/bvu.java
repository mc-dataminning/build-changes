import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvu {
   public static bwf<btb> a(int $$0, float $$1, int $$2) {
      return byh.a(
         (Function<byh.b<btb>, ? extends App<byh.c<btb>, byk<btb>>>)($$3 -> $$3.group(
                  $$3.c(ccf.m), $$3.a(ccf.b), $$3.a(ccf.C), $$3.a(ccf.t), $$3.a(ccf.n), $$3.a(ccf.r), $$3.a(ccf.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(cej.n), $$0xxxx -> true, $$12.dq(), $$2 + 1, cef.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.do(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(cej.n), $$0xxxxx -> true, cef.b.c, $$12.dq(), $$0, $$12.dT()))
                           .or(() -> $$3.<ji>a($$5).map(ji::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(ji.a($$11.af(), $$10xx));
                              if (!$$10xx.a($$12.do(), (double)$$2)) {
                                 $$4.a(new cci($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
