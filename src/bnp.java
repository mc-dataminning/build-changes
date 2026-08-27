import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bnp {
   public static ble<bjm> a(int $$0, BiPredicate<bjm, bjm> $$1) {
      return bop.a(
         (Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$2 -> $$2.group($$2.b(bsn.o), $$2.a(bsn.aa), $$2.c(bsn.ah), $$2.a(bsn.ai))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bjm $$10 = $$2.b($$3);
                     if (!$$10.ev()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dl(), (long)$$0);
                        if ($$10.ag() != bja.bt || $$7.X().b(cpx.J)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
