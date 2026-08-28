import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwx {
   public static bxi<buf> a(int $$0, float $$1, int $$2) {
      return bzk.a(
         (Function<bzk.b<buf>, ? extends App<bzk.c<buf>, bzn<buf>>>)($$3 -> $$3.group(
                  $$3.c(cdi.m), $$3.a(cdi.b), $$3.a(cdi.C), $$3.a(cdi.t), $$3.a(cdi.n), $$3.a(cdi.r), $$3.a(cdi.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(cfm.n), $$0xxxx -> true, $$12.ds(), $$2 + 1, cfi.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dq(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(cfm.n), $$0xxxxx -> true, cfi.b.c, $$12.ds(), $$0, $$12.dV()))
                           .or(() -> $$3.<jm>a($$5).map(jm::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jm.a($$11.ag(), $$10xx));
                              if (!$$10xx.a($$12.dq(), (double)$$2)) {
                                 $$4.a(new cdl($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
