import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpc {
   public static bpn<bml> a(int $$0, float $$1, int $$2) {
      return brp.a(
         (Function<brp.b<bml>, ? extends App<brp.c<bml>, brs<bml>>>)($$3 -> $$3.group(
                  $$3.c(bvn.m), $$3.a(bvn.b), $$3.a(bvn.C), $$3.a(bvn.t), $$3.a(bvn.n), $$3.a(bvn.r), $$3.a(bvn.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(bxq.n), $$0xxxx -> true, $$12.dm(), $$2 + 1, bxm.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dk(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(bxq.n), $$0xxxxx -> true, bxm.b.c, $$12.dm(), $$0, $$12.eg()))
                           .or(() -> $$3.<ig>a($$5).map(ig::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(ig.a($$11.ae(), $$10xx));
                              if (!$$10xx.a($$12.dk(), (double)$$2)) {
                                 $$4.a(new bvq($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
