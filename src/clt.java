import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class clt<E extends cll> {
   public static bvg<btl> a(int $$0) {
      return bys.a(
         (Function<bys.b<btl>, ? extends App<bys.c<btl>, byv<btl>>>)($$1 -> $$1.group($$1.b(ccq.ad), $$1.a(ccq.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eV().e()) {
                        return false;
                     } else {
                        Optional<cjf> $$7 = $$1.a($$3);
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
