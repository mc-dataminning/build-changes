import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class btv {
   public static bri<bpp> a(Function<bpp, Optional<bsv>> $$0, Predicate<bpp> $$1, int $$2, int $$3, float $$4) {
      return buu.a(
         (Function<buu.b<bpp>, ? extends App<buu.c<bpp>, bux<bpp>>>)($$5 -> $$5.group($$5.a(bys.n), $$5.a(bys.m))
               .apply($$5, ($$5x, $$6) -> ($$7, $$8, $$9) -> {
                     Optional<bsv> $$10 = $$0.apply($$8);
                     if (!$$10.isEmpty() && $$1.test($$8)) {
                        bsv $$11 = $$10.get();
                        if ($$8.dk().a((iv)$$11.a(), (double)$$3)) {
                           return false;
                        } else {
                           bsv $$12 = $$10.get();
                           $$5x.a($$12);
                           $$6.a(new byv($$12, $$4, $$2));
                           return true;
                        }
                     } else {
                        return false;
                     }
                  }))
      );
   }
}
