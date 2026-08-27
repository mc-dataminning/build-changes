import com.mojang.datafixers.kinds.App;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class bpo {
   public static bnd<bll> a(int $$0, BiPredicate<bll, bll> $$1) {
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$2 -> $$2.group($$2.b(bum.o), $$2.a(bum.aa), $$2.c(bum.ah), $$2.a(bum.ai))
               .apply($$2, ($$3, $$4, $$5, $$6) -> ($$7, $$8, $$9) -> {
                     bll $$10 = $$2.b($$3);
                     if (!$$10.ex()) {
                        return false;
                     } else {
                        if ($$1.test($$8, $$10)) {
                           $$6.a(true, (long)$$0);
                        }

                        $$5.a($$10.dn(), (long)$$0);
                        if ($$10.ai() != bkz.bt || $$7.Y().b(csb.N)) {
                           $$3.b();
                           $$4.b();
                        }

                        return true;
                     }
                  }))
      );
   }
}
