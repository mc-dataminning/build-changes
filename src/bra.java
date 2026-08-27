import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bra {
   public static brl<boi> a(int $$0, float $$1, int $$2) {
      return btn.a(
         (Function<btn.b<boi>, ? extends App<btn.c<boi>, btq<boi>>>)($$3 -> $$3.group(
                  $$3.c(bxl.m), $$3.a(bxl.b), $$3.a(bxl.C), $$3.a(bxl.t), $$3.a(bxl.n), $$3.a(bxl.r), $$3.a(bxl.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(bzp.n), $$0xxxx -> true, $$12.dm(), $$2 + 1, bzl.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dk(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(bzp.n), $$0xxxxx -> true, bzl.b.c, $$12.dm(), $$0, $$12.eh()))
                           .or(() -> $$3.<ii>a($$5).map(ii::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(ii.a($$11.ad(), $$10xx));
                              if (!$$10xx.a($$12.dk(), (double)$$2)) {
                                 $$4.a(new bxo($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
