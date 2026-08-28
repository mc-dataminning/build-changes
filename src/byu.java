import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byu {
   public static bzf<bwb> a(int $$0, float $$1, int $$2) {
      return cbh.a(
         (Function<cbh.b<bwb>, ? extends App<cbh.c<bwb>, cbk<bwb>>>)($$3 -> $$3.group(
                  $$3.c(cff.m), $$3.a(cff.b), $$3.a(cff.C), $$3.a(cff.t), $$3.a(cff.n), $$3.a(cff.r), $$3.a(cff.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.z()
                           .d($$0xxxx -> $$0xxxx.a(chj.n), $$0xxxx -> true, $$12.dv(), $$2 + 1, chf.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dt(), (double)$$2))
                           .or(() -> $$11.z().a($$0xxxxx -> $$0xxxxx.a(chj.n), $$0xxxxx -> true, chf.b.c, $$12.dv(), $$0, $$12.dY()))
                           .or(() -> $$3.<jp>a($$5).map(jp::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jp.a($$11.ah(), $$10xx));
                              if (!$$10xx.a($$12.dt(), (double)$$2)) {
                                 $$4.a(new cfi($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
