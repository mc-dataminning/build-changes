import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class brp {
   public static bsa<box> a(int $$0, float $$1, int $$2) {
      return buc.a(
         (Function<buc.b<box>, ? extends App<buc.c<box>, buf<box>>>)($$3 -> $$3.group(
                  $$3.c(bya.m), $$3.a(bya.b), $$3.a(bya.C), $$3.a(bya.t), $$3.a(bya.n), $$3.a(bya.r), $$3.a(bya.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(cae.n), $$0xxxx -> true, $$12.dj(), $$2 + 1, caa.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dh(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(cae.n), $$0xxxxx -> true, caa.b.c, $$12.dj(), $$0, $$12.ef()))
                           .or(() -> $$3.<ik>a($$5).map(ik::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(ik.a($$11.ad(), $$10xx));
                              if (!$$10xx.a($$12.dh(), (double)$$2)) {
                                 $$4.a(new byd($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
