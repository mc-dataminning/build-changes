import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bna {
   public static bnk<bkj> a(int $$0, float $$1, int $$2) {
      return bpm.a(
         (Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$3 -> $$3.group(
                  $$3.c(btk.m), $$3.a(btk.b), $$3.a(btk.C), $$3.a(btk.t), $$3.a(btk.n), $$3.a(btk.r), $$3.a(btk.q)
               )
               .apply(
                  $$3,
                  ($$4, $$5, $$6, $$7, $$8, $$9, $$10) -> ($$11, $$12, $$13) -> {
                        $$11.w()
                           .d($$0xxxx -> $$0xxxx.a(bvm.n), $$0xxxx -> true, $$12.dl(), $$2 + 1, bvi.b.c)
                           .filter($$2xxxx -> $$2xxxx.a($$12.dj(), (double)$$2))
                           .or(() -> $$11.w().a($$0xxxxx -> $$0xxxxx.a(bvm.n), $$0xxxxx -> true, bvi.b.c, $$12.dl(), $$0, $$12.ef()))
                           .or(() -> $$3.<ia>a($$5).map(ia::b))
                           .ifPresent($$10xx -> {
                              $$7.b();
                              $$8.b();
                              $$9.b();
                              $$10.b();
                              $$6.a(ia.a($$11.ac(), $$10xx));
                              if (!$$10xx.a($$12.dj(), (double)$$2)) {
                                 $$4.a(new btn($$10xx, $$1, $$2));
                              }
                           });
                        return true;
                     }
               ))
      );
   }
}
