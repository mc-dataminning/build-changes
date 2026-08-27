import com.mojang.datafixers.kinds.App;
import java.util.function.Function;

public class bkl {
   public static bly<bib> a(bfz $$0, float $$1) {
      return a($$0, $$1x -> $$1);
   }

   public static bly<bib> a(bfz $$0, Function<biw, Float> $$1) {
      return boa.a(
         (Function<boa.b<bib>, ? extends App<boa.c<bib>, bod<bib>>>)($$2 -> $$2.group($$2.b(bry.J), $$2.a(bry.n), $$2.c(bry.m))
               .apply($$2, ($$3, $$4, $$5) -> ($$6, $$7, $$8) -> {
                     if (!$$7.i_()) {
                        return false;
                     } else {
                        bib $$9 = $$2.b($$3);
                        if ($$7.a($$9, (double)($$0.b() + 1)) && !$$7.a($$9, (double)$$0.a())) {
                           bsb $$10 = new bsb(new bkz($$9, false), $$1.apply($$7), $$0.a() - 1);
                           $$4.a(new bkz($$9, true));
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
