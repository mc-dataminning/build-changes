import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bpb {
   public static bpm<bmk> a(int $$0, float $$1, int $$2) {
      return bro.a(
         (Function<bro.b<bmk>, ? extends App<bro.c<bmk>, brr<bmk>>>)($$3 -> $$3.group(
                  $$3.c(bvm.m), $$3.a(bvm.b), $$3.a(bvm.C), $$3.a(bvm.t), $$3.a(bvm.n), $$3.a(bvm.r), $$3.a(bvm.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(bxp.n), $$0xxxx -> true, $$12.dm(), $$2 + 1, bxl.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dk(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(bxp.n), $$0xxxxx -> true, bxl.b.c, $$12.dm(), $$0, $$12.eg()))
                           .or(() -> $$3.<ig>a($$5).map(ig::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(ig.a($$11.ae(), $$10xx));
                              if (!$$10xx.a($$12.dk(), (double)$$2)) {
                                 $$4.a(new bvp($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
