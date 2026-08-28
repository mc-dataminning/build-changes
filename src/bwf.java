import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bwf {
   public static bwq<btl> a(int $$0, float $$1, int $$2) {
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$3 -> $$3.group(
                  $$3.c(ccq.m), $$3.a(ccq.b), $$3.a(ccq.C), $$3.a(ccq.t), $$3.a(ccq.n), $$3.a(ccq.r), $$3.a(ccq.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(ceu.n), $$0xxxx -> true, $$12.dq(), $$2 + 1, ceq.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.do(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(ceu.n), $$0xxxxx -> true, ceq.b.c, $$12.dq(), $$0, $$12.dT()))
                           .or(() -> $$3.<jl>a($$5).map(jl::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jl.a($$11.af(), $$10xx));
                              if (!$$10xx.a($$12.do(), (double)$$2)) {
                                 $$4.a(new cct($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
