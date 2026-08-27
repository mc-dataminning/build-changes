import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blq {
   public static bma<biy> a(int $$0, float $$1, int $$2) {
      return boc.a(
         (Function<boc.b<biy>, ? extends App<boc.c<biy>, bof<biy>>>)($$3 -> $$3.group(
                  $$3.c(bsa.m), $$3.a(bsa.b), $$3.a(bsa.C), $$3.a(bsa.t), $$3.a(bsa.n), $$3.a(bsa.r), $$3.a(bsa.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.w()
                           .d($$0xxxx -> $$0xxxx.a(buc.n), $$0xxxx -> true, $$12.dk(), $$2 + 1, bty.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.di(), (double)$$2))
                           .or(() -> $$11.w().a($$0xxxxx -> $$0xxxxx.a(buc.n), $$0xxxxx -> true, bty.b.c, $$12.dk(), $$0, $$12.ee()))
                           .or(() -> $$3.<hd>a($$5).map(hd::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(hd.a($$11.ac(), $$10xx));
                              if (!$$10xx.a($$12.di(), (double)$$2)) {
                                 $$4.a(new bsd($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
