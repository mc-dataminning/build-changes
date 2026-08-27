import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ccx<E extends ccp> {
   public static bnd<bll> a(int $$0) {
      return bqo.a(
         (Function<bqo.b<bll>, ? extends App<bqo.c<bll>, bqr<bll>>>)($$1 -> $$1.group($$1.b(bum.ac), $$1.a(bum.K))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eV().b()) {
                        return false;
                     } else {
                        Optional<cas> $$7 = $$1.a($$3);
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
