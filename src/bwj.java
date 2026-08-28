import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwj {
   public static bwu<btq> a(int $$0, float $$1, int $$2) {
      return byw.a(
         (Function<byw.b<btq>, ? extends App<byw.c<btq>, byz<btq>>>)($$3 -> $$3.group(
                  $$3.c(ccu.m), $$3.a(ccu.b), $$3.a(ccu.C), $$3.a(ccu.t), $$3.a(ccu.n), $$3.a(ccu.r), $$3.a(ccu.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(cey.n), $$0xxxx -> true, $$12.dp(), $$2 + 1, ceu.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dn(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(cey.n), $$0xxxxx -> true, ceu.b.c, $$12.dp(), $$0, $$12.el()))
                           .or(() -> $$3.<jh>a($$5).map(jh::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jh.a($$11.af(), $$10xx));
                              if (!$$10xx.a($$12.dn(), (double)$$2)) {
                                 $$4.a(new ccx($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
