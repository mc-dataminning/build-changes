import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class coo<E extends cof> {
   public static bxs<bvy> a(int $$0) {
      return cbe.a(
         (Function<cbe.b<bvy>, ? extends App<cbe.c<bvy>, cbh<bvy>>>)($$1 -> $$1.group($$1.b(cfc.ad), $$1.a(cfc.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fa().f()) {
                        return false;
                     } else {
                        Optional<clw> $$7 = $$1.a($$3);
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
