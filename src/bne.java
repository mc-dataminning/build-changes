import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bne {
   public static bkt<bjb> a(int $$0, BiPredicate<bjb, bjb> $$1) {
      return boe.a(
         (Function<boe.b<bjb>, ? extends App<boe.c<bjb>, boh<bjb>>>)($$2 -> $$2.group($$2.b(bsc.o), $$2.a(bsc.aa), $$2.c(bsc.ah), $$2.a(bsc.ai))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bjb $$10 = $$2.b($$3);
                     if (!$$10.eu()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dk(), (long)$$0);
                        if ($$10.ag() != bip.bt || $$7.X().b(cpm.J)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
