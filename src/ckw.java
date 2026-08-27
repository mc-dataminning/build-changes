import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ckw<E extends cko> {
   public static buk<bsq> a(int $$0) {
      return bxw.a(
         (Function<bxw.b<bsq>, ? extends App<bxw.c<bsq>, bxz<bsq>>>)($$1 -> $$1.group($$1.b(cbu.ad), $$1.a(cbu.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eY().e()) {
                        return false;
                     } else {
                        Optional<cii> $$7 = $$1.a($$3);
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
