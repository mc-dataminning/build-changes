import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class clv<E extends cln> {
   public static bvi<btn> a(int $$0) {
      return byu.a(
         (Function<byu.b<btn>, ? extends App<byu.c<btn>, byx<btn>>>)($$1 -> $$1.group($$1.b(ccs.ad), $$1.a(ccs.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eV().e()) {
                        return false;
                     } else {
                        Optional<cjh> $$7 = $$1.a($$3);
                        if ($$7.isPresent() && $$7.get().a($$5, (double)$$0)) {
                           return false;
                        } else {
                           $$2.b();
                           return true;
                        }
                     }
                  }))
      );
   }
}
