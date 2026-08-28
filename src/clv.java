import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class clv<E extends cln> {
   public static bvj<btp> a(int $$0) {
      return byv.a(
         (Function<byv.b<btp>, ? extends App<byv.c<btp>, byy<btp>>>)($$1 -> $$1.group($$1.b(cct.ad), $$1.a(cct.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eY().e()) {
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
