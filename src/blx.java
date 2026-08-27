import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class blx {
   public static bnk<bjo> a(bhm $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bnk<bjo> a(bhm $$0, Function<bkj, Float> $$1) {
      return bpm.a(
         (Function<bpm.b<bjo>, ? extends App<bpm.c<bjo>, bpp<bjo>>>)($$2 -> $$2.group($$2.b(btk.J), $$2.a(btk.n), $$2.c(btk.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.n_()) {
                        return false;
                     } else {
                        bjo $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           btn $$10 = new btn(new bml($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bml($$9, true));
                           $$5.a($$10);
                           return true;
                        } else {
                           return false;
                        }
                     }
                  }))
      );
   }
}
