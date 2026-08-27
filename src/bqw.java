import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bqw {
   public static brh<bog> a(int $$0, float $$1, int $$2) {
      return btj.a(
         (Function<btj.b<bog>, ? extends App<btj.c<bog>, btm<bog>>>)($$3 -> $$3.group(
                  $$3.c(bxh.m), $$3.a(bxh.b), $$3.a(bxh.C), $$3.a(bxh.t), $$3.a(bxh.n), $$3.a(bxh.r), $$3.a(bxh.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(bzl.n), $$0xxxx -> true, $$12.dm(), $$2 + 1, bzh.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dk(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(bzl.n), $$0xxxxx -> true, bzh.b.c, $$12.dm(), $$0, $$12.eh()))
                           .or(() -> $$3.<ii>a($$5).map(ii::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(ii.a($$11.ae(), $$10xx));
                              if (!$$10xx.a($$12.dk(), (double)$$2)) {
                                 $$4.a(new bxk($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
