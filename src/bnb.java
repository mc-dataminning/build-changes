import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bnb {
   public static bkq<biy> a(int $$0, BiPredicate<biy, biy> $$1) {
      return bob.a(
         (Function<bob.b<biy>, ? extends App<bob.c<biy>, boe<biy>>>)($$2 -> $$2.group($$2.b(brz.o), $$2.a(brz.aa), $$2.c(brz.ah), $$2.a(brz.ai))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     biy $$10 = $$2.b($$3);
                     if (!$$10.eu()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dk(), (long)$$0);
                        if ($$10.ag() != bim.bt || $$7.X().b(cph.J)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
