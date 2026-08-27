import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bom {
   public static bmb<bkj> a(int $$0, BiPredicate<bkj, bkj> $$1) {
      return bpm.a(
         (Function<bpm.b<bkj>, ? extends App<bpm.c<bkj>, bpp<bkj>>>)($$2 -> $$2.group($$2.b(btk.o), $$2.a(btk.aa), $$2.c(btk.ah), $$2.a(btk.ai))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bkj $$10 = $$2.b($$3);
                     if (!$$10.ev()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dl(), (long)$$0);
                        if ($$10.ag() != bjx.bt || $$7.X().b(cqv.K)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
