import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bna {
   public static bkp<biw> a(int $$0, BiPredicate<biw, biw> $$1) {
      return boa.a(
         (Function<boa.b<biw>, ? extends App<boa.c<biw>, bod<biw>>>)($$2 -> $$2.group($$2.b(bry.o), $$2.a(bry.aa), $$2.c(bry.ah), $$2.a(bry.ai))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     biw $$10 = $$2.b($$3);
                     if (!$$10.eu()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dk(), (long)$$0);
                        if ($$10.ag() != bik.bt || $$7.X().b(cpg.J)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
