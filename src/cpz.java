import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cpz<E extends cpr> {
   public static byw<bxe> a(int $$0) {
      return cci.a(
         (Function<cci.b<bxe>, ? extends App<cci.c<bxe>, ccl<bxe>>>)($$1 -> $$1.group($$1.b(cgg.ae), $$1.a(cgg.M))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fc().f()) {
                        return false;
                     } else {
                        Optional<cnh> $$7 = $$1.a($$3);
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
