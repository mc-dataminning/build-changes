import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bom {
   public static box<blv> a(int $$0, float $$1, int $$2) {
      return bqz.a(
         (Function<bqz.b<blv>, ? extends App<bqz.c<blv>, brc<blv>>>)($$3 -> $$3.group(
                  $$3.c(bux.m), $$3.a(bux.b), $$3.a(bux.C), $$3.a(bux.t), $$3.a(bux.n), $$3.a(bux.r), $$3.a(bux.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.x()
                           .d($$0xxxx -> $$0xxxx.a(bxa.n), $$0xxxx -> true, $$12.dm(), $$2 + 1, bww.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dk(), (double)$$2))
                           .or(() -> $$11.x().a($$0xxxxx -> $$0xxxxx.a(bxa.n), $$0xxxxx -> true, bww.b.c, $$12.dm(), $$0, $$12.eg()))
                           .or(() -> $$3.<id>a($$5).map(id::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(id.a($$11.ad(), $$10xx));
                              if (!$$10xx.a($$12.dk(), (double)$$2)) {
                                 $$4.a(new bva($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
