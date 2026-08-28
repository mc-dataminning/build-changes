import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzt {
   public static cae<bxc> a(int $$0, float $$1, int $$2) {
      return ccg.a(
         (Function<ccg.b<bxc>, ? extends App<ccg.c<bxc>, ccj<bxc>>>)($$3 -> $$3.group(
                  $$3.c(cge.n), $$3.a(cge.b), $$3.a(cge.D), $$3.a(cge.u), $$3.a(cge.o), $$3.a(cge.s), $$3.a(cge.r)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.A()
                           .d($$0xxxx -> $$0xxxx.a(cii.n), $$0xxxx -> true, $$12.dv(), $$2 + 1, cie.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dt(), (double)$$2))
                           .or(() -> $$11.A().a($$0xxxxx -> $$0xxxxx.a(cii.n), $$0xxxxx -> true, cie.b.c, $$12.dv(), $$0, $$12.dY()))
                           .or(() -> $$3.<jd>a($$5).map(jd::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jd.a($$11.aj(), $$10xx));
                              if (!$$10xx.a($$12.dt(), (double)$$2)) {
                                 $$4.a(new cgh($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
