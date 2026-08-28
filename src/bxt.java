import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bxt {
   public static bye<bva> a(int $$0, float $$1, int $$2) {
      return cag.a(
         (Function<cag.b<bva>, ? extends App<cag.c<bva>, caj<bva>>>)($$3 -> $$3.group(
                  $$3.c(cee.m), $$3.a(cee.b), $$3.a(cee.C), $$3.a(cee.t), $$3.a(cee.n), $$3.a(cee.r), $$3.a(cee.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.y()
                           .d($$0xxxx -> $$0xxxx.a(cgi.n), $$0xxxx -> true, $$12.dx(), $$2 + 1, cge.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dv(), (double)$$2))
                           .or(() -> $$11.y().a($$0xxxxx -> $$0xxxxx.a(cgi.n), $$0xxxxx -> true, cge.b.c, $$12.dx(), $$0, $$12.ea()))
                           .or(() -> $$3.<jp>a($$5).map(jp::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(jp.a($$11.ag(), $$10xx));
                              if (!$$10xx.a($$12.dv(), (double)$$2)) {
                                 $$4.a(new ceh($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
