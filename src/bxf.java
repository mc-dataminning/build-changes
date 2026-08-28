import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxf {
   public static bxq<bun> a(int $$0, float $$1, int $$2) {
      return bzs.a(
         (Function<bzs.b<bun>, ? extends App<bzs.c<bun>, bzv<bun>>>)($$3 -> $$3.group(
                  $$3.c(cdq.m), $$3.a(cdq.b), $$3.a(cdq.C), $$3.a(cdq.t), $$3.a(cdq.n), $$3.a(cdq.r), $$3.a(cdq.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(cfu.n), $$0xxxx -> true, $$12.ds(), $$2 + 1, cfq.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dq(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(cfu.n), $$0xxxxx -> true, cfq.b.c, $$12.ds(), $$0, $$12.dV()))
                           .or(() -> $$3.<jn>a($$5).map(jn::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jn.a($$11.ag(), $$10xx));
                              if (!$$10xx.a($$12.dq(), (double)$$2)) {
                                 $$4.a(new cdt($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
