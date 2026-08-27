import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bmd {
   public static bmn<bjm> a(int $$0, float $$1, int $$2) {
      return bop.a(
         (Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$3 -> $$3.group(
                  $$3.c(bsn.m), $$3.a(bsn.b), $$3.a(bsn.C), $$3.a(bsn.t), $$3.a(bsn.n), $$3.a(bsn.r), $$3.a(bsn.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.w()
                           .d($$0xxxx -> $$0xxxx.a(bup.n), $$0xxxx -> true, $$12.dl(), $$2 + 1, bul.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dj(), (double)$$2))
                           .or(() -> $$11.w().a($$0xxxxx -> $$0xxxxx.a(bup.n), $$0xxxxx -> true, bul.b.c, $$12.dl(), $$0, $$12.ef()))
                           .or(() -> $$3.<hd>a($$5).map(hd::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(hd.a($$11.ac(), $$10xx));
                              if (!$$10xx.a($$12.dj(), (double)$$2)) {
                                 $$4.a(new bsq($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
