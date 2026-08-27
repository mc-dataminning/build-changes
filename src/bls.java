import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bls {
   public static bmc<bjb> a(int $$0, float $$1, int $$2) {
      return boe.a(
         (Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$3 -> $$3.group(
                  $$3.c(bsc.m), $$3.a(bsc.b), $$3.a(bsc.C), $$3.a(bsc.t), $$3.a(bsc.n), $$3.a(bsc.r), $$3.a(bsc.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.w()
                           .d($$0xxxx -> $$0xxxx.a(bue.n), $$0xxxx -> true, $$12.dk(), $$2 + 1, bua.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.di(), (double)$$2))
                           .or(() -> $$11.w().a($$0xxxxx -> $$0xxxxx.a(bue.n), $$0xxxxx -> true, bua.b.c, $$12.dk(), $$0, $$12.ee()))
                           .or(() -> $$3.<hf>a($$5).map(hf::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(hf.a($$11.ac(), $$10xx));
                              if (!$$10xx.a($$12.di(), (double)$$2)) {
                                 $$4.a(new bsf($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
