import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvr {
   public static bwc<bsy> a(int $$0, float $$1, int $$2) {
      return bye.a(
         (Function<bye.b<bsy>, ? extends App<bye.c<bsy>, byh<bsy>>>)($$3 -> $$3.group(
                  $$3.c(ccc.m), $$3.a(ccc.b), $$3.a(ccc.C), $$3.a(ccc.t), $$3.a(ccc.n), $$3.a(ccc.r), $$3.a(ccc.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(ceg.n), $$0xxxx -> true, $$12.dp(), $$2 + 1, cec.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dn(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(ceg.n), $$0xxxxx -> true, cec.b.c, $$12.dp(), $$0, $$12.dS()))
                           .or(() -> $$3.<ji>a($$5).map(ji::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(ji.a($$11.af(), $$10xx));
                              if (!$$10xx.a($$12.dn(), (double)$$2)) {
                                 $$4.a(new ccf($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
