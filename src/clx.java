import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class clx<E extends clp> {
   public static bvl<btr> a(int $$0) {
      return byx.a(
         (Function<byx.b<btr>, ? extends App<byx.c<btr>, bza<btr>>>)($$1 -> $$1.group($$1.b(ccv.ad), $$1.a(ccv.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eY().e()) {
                        return false;
                     } else {
                        Optional<cjj> $$7 = $$1.a($$3);
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
