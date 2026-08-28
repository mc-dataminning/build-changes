import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxo {
   public static bxz<buv> a(int $$0, float $$1, int $$2) {
      return cab.a(
         (Function<cab.b<buv>, ? extends App<cab.c<buv>, cae<buv>>>)($$3 -> $$3.group(
                  $$3.c(cdz.m), $$3.a(cdz.b), $$3.a(cdz.C), $$3.a(cdz.t), $$3.a(cdz.n), $$3.a(cdz.r), $$3.a(cdz.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(cgd.n), $$0xxxx -> true, $$12.dx(), $$2 + 1, cfz.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dv(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(cgd.n), $$0xxxxx -> true, cfz.b.c, $$12.dx(), $$0, $$12.ea()))
                           .or(() -> $$3.<jo>a($$5).map(jo::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jo.a($$11.ag(), $$10xx));
                              if (!$$10xx.a($$12.dv(), (double)$$2)) {
                                 $$4.a(new cec($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
