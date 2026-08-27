import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvh {
   public static bvs<bso> a(int $$0, float $$1, int $$2) {
      return bxu.a(
         (Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$3 -> $$3.group(
                  $$3.c(cbs.m), $$3.a(cbs.b), $$3.a(cbs.C), $$3.a(cbs.t), $$3.a(cbs.n), $$3.a(cbs.r), $$3.a(cbs.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(cdw.n), $$0xxxx -> true, $$12.dp(), $$2 + 1, cds.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dn(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(cdw.n), $$0xxxxx -> true, cds.b.c, $$12.dp(), $$0, $$12.el()))
                           .or(() -> $$3.<iw>a($$5).map(iw::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(iw.a($$11.ae(), $$10xx));
                              if (!$$10xx.a($$12.dn(), (double)$$2)) {
                                 $$4.a(new cbv($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
