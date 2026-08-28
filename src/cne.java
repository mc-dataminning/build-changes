import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class cne<E extends cmw> {
   public static bwp<buv> a(int $$0) {
      return cab.a(
         (Function<cab.b<buv>, ? extends App<cab.c<buv>, cae<buv>>>)($$1 -> $$1.group($$1.b(cdz.ad), $$1.a(cdz.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.fc().f()) {
                        return false;
                     } else {
                        Optional<ckq> $$7 = $$1.a($$3);
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
