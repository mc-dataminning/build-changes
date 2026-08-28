import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byq {
   public static bzb<bvx> a(int $$0, float $$1, int $$2) {
      return cbd.a(
         (Function<cbd.b<bvx>, ? extends App<cbd.c<bvx>, cbg<bvx>>>)($$3 -> $$3.group(
                  $$3.c(cfb.m), $$3.a(cfb.b), $$3.a(cfb.C), $$3.a(cfb.t), $$3.a(cfb.n), $$3.a(cfb.r), $$3.a(cfb.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.A()
                           .d($$0xxxx -> $$0xxxx.a(chf.n), $$0xxxx -> true, $$12.dw(), $$2 + 1, chb.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.du(), (double)$$2))
                           .or(() -> $$11.A().a($$0xxxxx -> $$0xxxxx.a(chf.n), $$0xxxxx -> true, chb.b.c, $$12.dw(), $$0, $$12.dZ()))
                           .or(() -> $$3.<jp>a($$5).map(jp::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jp.a($$11.ai(), $$10xx));
                              if (!$$10xx.a($$12.du(), (double)$$2)) {
                                 $$4.a(new cfe($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
