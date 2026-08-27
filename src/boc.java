import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class boc {
   public static bom<bll> a(int $$0, float $$1, int $$2) {
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$3 -> $$3.group(
                  $$3.c(bum.m), $$3.a(bum.b), $$3.a(bum.C), $$3.a(bum.t), $$3.a(bum.n), $$3.a(bum.r), $$3.a(bum.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.x()
                           .d($$0xxxx -> $$0xxxx.a(bwo.n), $$0xxxx -> true, $$12.dn(), $$2 + 1, bwk.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dl(), (double)$$2))
                           .or(() -> $$11.x().a($$0xxxxx -> $$0xxxxx.a(bwo.n), $$0xxxxx -> true, bwk.b.c, $$12.dn(), $$0, $$12.eh()))
                           .or(() -> $$3.<ie>a($$5).map(ie::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(ie.a($$11.ad(), $$10xx));
                              if (!$$10xx.a($$12.dl(), (double)$$2)) {
                                 $$4.a(new bup($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
