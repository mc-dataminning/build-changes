import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxx {
   public static byi<bve> a(int $$0, float $$1, int $$2) {
      return cak.a(
         (Function<cak.b<bve>, ? extends App<cak.c<bve>, can<bve>>>)($$3 -> $$3.group(
                  $$3.c(cei.m), $$3.a(cei.b), $$3.a(cei.C), $$3.a(cei.t), $$3.a(cei.n), $$3.a(cei.r), $$3.a(cei.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(cgm.n), $$0xxxx -> true, $$12.dy(), $$2 + 1, cgi.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dw(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(cgm.n), $$0xxxxx -> true, cgi.b.c, $$12.dy(), $$0, $$12.eb()))
                           .or(() -> $$3.<jp>a($$5).map(jp::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jp.a($$11.ag(), $$10xx));
                              if (!$$10xx.a($$12.dw(), (double)$$2)) {
                                 $$4.a(new cel($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
