import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bvg {
   public static bvr<bso> a(int $$0, float $$1, int $$2) {
      return bxt.a(
         (Function<bxt.b<bso>, ? extends App<bxt.c<bso>, bxw<bso>>>)($$3 -> $$3.group(
                  $$3.c(cbr.m), $$3.a(cbr.b), $$3.a(cbr.C), $$3.a(cbr.t), $$3.a(cbr.n), $$3.a(cbr.r), $$3.a(cbr.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(cdv.n), $$0xxxx -> true, $$12.du(), $$2 + 1, cdr.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.ds(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(cdv.n), $$0xxxxx -> true, cdr.b.c, $$12.du(), $$0, $$12.et()))
                           .or(() -> $$3.<iz>a($$5).map(iz::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(iz.a($$11.af(), $$10xx));
                              if (!$$10xx.a($$12.ds(), (double)$$2)) {
                                 $$4.a(new cbu($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
