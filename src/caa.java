import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class caa {
   public static cal<bxj> a(int $$0, float $$1, int $$2) {
      return ccn.a(
         (Function<ccn.b<bxj>, ? extends App<ccn.c<bxj>, ccq<bxj>>>)($$3 -> $$3.group(
                  $$3.c(cgl.n), $$3.a(cgl.b), $$3.a(cgl.D), $$3.a(cgl.u), $$3.a(cgl.o), $$3.a(cgl.s), $$3.a(cgl.r)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.A()
                           .d($$0xxxx -> $$0xxxx.a(cip.n), $$0xxxx -> true, $$12.du(), $$2 + 1, cil.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.ds(), (double)$$2))
                           .or(() -> $$11.A().a($$0xxxxx -> $$0xxxxx.a(cip.n), $$0xxxxx -> true, cil.b.c, $$12.du(), $$0, $$12.dX()))
                           .or(() -> $$3.<je>a($$5).map(je::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(je.a($$11.aj(), $$10xx));
                              if (!$$10xx.a($$12.ds(), (double)$$2)) {
                                 $$4.a(new cgo($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
