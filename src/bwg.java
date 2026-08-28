import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwg {
   public static bwr<btn> a(int $$0, float $$1, int $$2) {
      return byt.a(
         (Function<byt.b<btn>, ? extends App<byt.c<btn>, byw<btn>>>)($$3 -> $$3.group(
                  $$3.c(ccr.m), $$3.a(ccr.b), $$3.a(ccr.C), $$3.a(ccr.t), $$3.a(ccr.n), $$3.a(ccr.r), $$3.a(ccr.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(cev.n), $$0xxxx -> true, $$12.dp(), $$2 + 1, cer.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dn(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(cev.n), $$0xxxxx -> true, cer.b.c, $$12.dp(), $$0, $$12.el()))
                           .or(() -> $$3.<jh>a($$5).map(jh::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jh.a($$11.af(), $$10xx));
                              if (!$$10xx.a($$12.dn(), (double)$$2)) {
                                 $$4.a(new ccu($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
