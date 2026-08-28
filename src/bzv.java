import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bzv {
   public static cag<bxe> a(int $$0, float $$1, int $$2) {
      return cci.a(
         (Function<cci.b<bxe>, ? extends App<cci.c<bxe>, ccl<bxe>>>)($$3 -> $$3.group(
                  $$3.c(cgg.n), $$3.a(cgg.b), $$3.a(cgg.D), $$3.a(cgg.u), $$3.a(cgg.o), $$3.a(cgg.s), $$3.a(cgg.r)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.A()
                           .d($$0xxxx -> $$0xxxx.a(cik.n), $$0xxxx -> true, $$12.dv(), $$2 + 1, cig.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dt(), (double)$$2))
                           .or(() -> $$11.A().a($$0xxxxx -> $$0xxxxx.a(cik.n), $$0xxxxx -> true, cig.b.c, $$12.dv(), $$0, $$12.dY()))
                           .or(() -> $$3.<jd>a($$5).map(jd::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jd.a($$11.aj(), $$10xx));
                              if (!$$10xx.a($$12.dt(), (double)$$2)) {
                                 $$4.a(new cgj($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
