import com.mojang.datafixers.kinds.App;
import java.util.Optional;
import java.util.function.Function;

public class ciy<E extends ciq> {
   public static bsm<bqt> a(int $$0) {
      return bvy.a(
         (Function<bvy.b<bqt>, ? extends App<bvy.c<bqt>, bwb<bqt>>>)($$1 -> $$1.group($$1.b(bzw.ad), $$1.a(bzw.L))
               .apply($$1, ($$2, $$3) -> ($$4, $$5, $$6) -> {
                     if (!$$5.eV().d()) {
                        return false;
                     } else {
                        Optional<cgk> $$7 = $$1.a($$3);
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
