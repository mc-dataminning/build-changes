import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bsh {
   public static bss<bpp> a(int $$0, float $$1, int $$2) {
      return buu.a(
         (Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$3 -> $$3.group(
                  $$3.c(bys.m), $$3.a(bys.b), $$3.a(bys.C), $$3.a(bys.t), $$3.a(bys.n), $$3.a(bys.r), $$3.a(bys.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(caw.n), $$0xxxx -> true, $$12.dm(), $$2 + 1, cas.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dk(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(caw.n), $$0xxxxx -> true, cas.b.c, $$12.dm(), $$0, $$12.ei()))
                           .or(() -> $$3.<ik>a($$5).map(ik::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(ik.a($$11.ad(), $$10xx));
                              if (!$$10xx.a($$12.dk(), (double)$$2)) {
                                 $$4.a(new byv($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
