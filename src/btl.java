import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class btl {
   public static btw<bqt> a(int $$0, float $$1, int $$2) {
      return bvy.a(
         (Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$3 -> $$3.group(
                  $$3.c(bzw.m), $$3.a(bzw.b), $$3.a(bzw.C), $$3.a(bzw.t), $$3.a(bzw.n), $$3.a(bzw.r), $$3.a(bzw.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(cca.n), $$0xxxx -> true, $$12.dm(), $$2 + 1, cbw.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dk(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(cca.n), $$0xxxxx -> true, cbw.b.c, $$12.dm(), $$0, $$12.ei()))
                           .or(() -> $$3.<im>a($$5).map(im::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(im.a($$11.ae(), $$10xx));
                              if (!$$10xx.a($$12.dk(), (double)$$2)) {
                                 $$4.a(new bzz($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
