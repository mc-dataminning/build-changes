import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bnp {
   public static bnz<bky> a(int $$0, float $$1, int $$2) {
      return bqb.a(
         (Function<bqb.b<bky>, ? extends App<bqb.c<bky>, bqe<bky>>>)($$3 -> $$3.group(
                  $$3.c(btz.m), $$3.a(btz.b), $$3.a(btz.C), $$3.a(btz.t), $$3.a(btz.n), $$3.a(btz.r), $$3.a(btz.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.w()
                           .d($$0xxxx -> $$0xxxx.a(bwb.n), $$0xxxx -> true, $$12.dl(), $$2 + 1, bvx.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dj(), (double)$$2))
                           .or(() -> $$11.w().a($$0xxxxx -> $$0xxxxx.a(bwb.n), $$0xxxxx -> true, bvx.b.c, $$12.dl(), $$0, $$12.ef()))
                           .or(() -> $$3.<ia>a($$5).map(ia::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(ia.a($$11.ac(), $$10xx));
                              if (!$$10xx.a($$12.dj(), (double)$$2)) {
                                 $$4.a(new buc($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
