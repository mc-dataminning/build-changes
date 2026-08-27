import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cku<E extends ckm> {
   public static bui<bso> a(int $$0) {
      return bxu.a(
         (Function<bxu.b<bso>, ? extends App<bxu.c<bso>, bxx<bso>>>)($$1 -> $$1.group($$1.b(cbs.ad), $$1.a(cbs.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eY().e()) {
                        return false;
                     } else {
                        Optional<cig> $$7 = $$1.a($$3);
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
