import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cay<E extends caq> {
   public static ble<bjm> a(int $$0) {
      return bop.a(
         (Function<bop.b<bjm>, ? extends App<bop.c<bjm>, bos<bjm>>>)($$1 -> $$1.group($$1.b(bsn.ac), $$1.a(bsn.K))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eT().b()) {
                        return false;
                     } else {
                        Optional<byt> $$7 = $$1.a($$3);
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
