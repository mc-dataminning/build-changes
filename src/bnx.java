import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnx {
   public static boh<blg> a(int $$0, float $$1, int $$2) {
      return bqj.a(
         (Function<bqj.b<blg>, ? extends App<bqj.c<blg>, bqm<blg>>>)($$3 -> $$3.group(
                  $$3.c(buh.m), $$3.a(buh.b), $$3.a(buh.C), $$3.a(buh.t), $$3.a(buh.n), $$3.a(buh.r), $$3.a(buh.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.x()
                           .d($$0xxxx -> $$0xxxx.a(bwj.n), $$0xxxx -> true, $$12.dn(), $$2 + 1, bwf.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dl(), (double)$$2))
                           .or(() -> $$11.x().a($$0xxxxx -> $$0xxxxx.a(bwj.n), $$0xxxxx -> true, bwf.b.c, $$12.dn(), $$0, $$12.eh()))
                           .or(() -> $$3.<ia>a($$5).map(ia::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(ia.a($$11.ad(), $$10xx));
                              if (!$$10xx.a($$12.dl(), (double)$$2)) {
                                 $$4.a(new buk($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
