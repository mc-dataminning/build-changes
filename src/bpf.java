import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpf {
   public static bpq<bmo> a(int $$0, float $$1, int $$2) {
      return brs.a(
         (Function<brs.b<bmo>, ? extends App<brs.c<bmo>, brv<bmo>>>)($$3 -> $$3.group(
                  $$3.c(bvq.m), $$3.a(bvq.b), $$3.a(bvq.C), $$3.a(bvq.t), $$3.a(bvq.n), $$3.a(bvq.r), $$3.a(bvq.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(bxu.n), $$0xxxx -> true, $$12.dl(), $$2 + 1, bxq.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dj(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(bxu.n), $$0xxxxx -> true, bxq.b.c, $$12.dl(), $$0, $$12.eg()))
                           .or(() -> $$3.<ig>a($$5).map(ig::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(ig.a($$11.ae(), $$10xx));
                              if (!$$10xx.a($$12.dj(), (double)$$2)) {
                                 $$4.a(new bvt($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
