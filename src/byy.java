import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class byy {
   public static bzj<bwf> a(int $$0, float $$1, int $$2) {
      return cbl.a(
         (Function<cbl.b<bwf>, ? extends App<cbl.c<bwf>, cbo<bwf>>>)($$3 -> $$3.group(
                  $$3.c(cfj.m), $$3.a(cfj.b), $$3.a(cfj.C), $$3.a(cfj.t), $$3.a(cfj.n), $$3.a(cfj.r), $$3.a(cfj.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.z()
                           .d($$0xxxx -> $$0xxxx.a(chn.n), $$0xxxx -> true, $$12.dw(), $$2 + 1, chj.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.du(), (double)$$2))
                           .or(() -> $$11.z().a($$0xxxxx -> $$0xxxxx.a(chn.n), $$0xxxxx -> true, chj.b.c, $$12.dw(), $$0, $$12.dZ()))
                           .or(() -> $$3.<jp>a($$5).map(jp::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jp.a($$11.ah(), $$10xx));
                              if (!$$10xx.a($$12.du(), (double)$$2)) {
                                 $$4.a(new cfm($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
