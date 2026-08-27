import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class btg {
   public static btr<bqo> a(int $$0, float $$1, int $$2) {
      return bvt.a(
         (Function<bvt.b<bqo>, ? extends App<bvt.c<bqo>, bvw<bqo>>>)($$3 -> $$3.group(
                  $$3.c(bzr.m), $$3.a(bzr.b), $$3.a(bzr.C), $$3.a(bzr.t), $$3.a(bzr.n), $$3.a(bzr.r), $$3.a(bzr.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(cbv.n), $$0xxxx -> true, $$12.dm(), $$2 + 1, cbr.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dk(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(cbv.n), $$0xxxxx -> true, cbr.b.c, $$12.dm(), $$0, $$12.ei()))
                           .or(() -> $$3.<ik>a($$5).map(ik::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(ik.a($$11.ae(), $$10xx));
                              if (!$$10xx.a($$12.dk(), (double)$$2)) {
                                 $$4.a(new bzu($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
