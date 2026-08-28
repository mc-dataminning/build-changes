import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxy {
   public static byj<bvf> a(int $$0, float $$1, int $$2) {
      return cal.a(
         (Function<cal.b<bvf>, ? extends App<cal.c<bvf>, cao<bvf>>>)($$3 -> $$3.group(
                  $$3.c(cej.m), $$3.a(cej.b), $$3.a(cej.C), $$3.a(cej.t), $$3.a(cej.n), $$3.a(cej.r), $$3.a(cej.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.A()
                           .d($$0xxxx -> $$0xxxx.a(cgn.n), $$0xxxx -> true, $$12.dw(), $$2 + 1, cgj.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.du(), (double)$$2))
                           .or(() -> $$11.A().a($$0xxxxx -> $$0xxxxx.a(cgn.n), $$0xxxxx -> true, cgj.b.c, $$12.dw(), $$0, $$12.dZ()))
                           .or(() -> $$3.<jq>a($$5).map(jq::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jq.a($$11.ai(), $$10xx));
                              if (!$$10xx.a($$12.du(), (double)$$2)) {
                                 $$4.a(new cem($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
